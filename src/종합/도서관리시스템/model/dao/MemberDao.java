package 종합.도서관리시스템.model.dao;

import 종합.도서관리시스템.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance=new MemberDao();
    public static MemberDao getInstance(){return instance;}

    private ArrayList<MemberDto> members=new ArrayList<>();

    private int currentMno=1;
    public boolean signup(String mid, String mpw, String mtype){
        MemberDto memberDto=new MemberDto(currentMno,mid,mpw,mtype);
        boolean result=members.add(memberDto);
        if(result){currentMno++;}
        return result;
    }

    public int login(String mid, String mpw){
        for(int index=0; index<=members.size()-1;index++){
            MemberDto personDto=members.get(index);
            if(personDto.getMid().equals(mid)&&personDto.getMpw().equals(mpw)){
                return personDto.getMno();
            }
        } return 0;
    }
}
