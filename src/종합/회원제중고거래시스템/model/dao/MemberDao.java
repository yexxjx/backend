package 종합.회원제중고거래시스템.model.dao;

import 종합.회원제중고거래시스템.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){ return instance; }

    private ArrayList<MemberDto> members=new ArrayList<>();

    private int currentMno = 1;
    public boolean signup( String mid , String mpw , String mname , String mphone ){
        System.out.println("MemberDao.signup");
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone);
        MemberDto memberDto = new MemberDto( currentMno , mid , mpw , mname , mphone );
        boolean result = members.add( memberDto );
        if( result ){ currentMno++; }
        return result;
    }

    public int login(String mid, String mpw){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid+",mpw = " + mpw);
        for(int index=0;index<=members.size()-1;index++){
            MemberDto memberDto=members.get(index);
            if(memberDto.getMid().equals(mid)&&memberDto.getMpw().equals(mpw)){
                return memberDto.getMno();
            }
        }
        return 0;
    }

    public String findMname( int mno ){
        for( int index = 0 ; index <= members.size()-1 ; index++ ){
            if( members.get(index).getMno() == mno ){
                return members.get(index).getMname();
            }
        }
        return null;
    }
}
