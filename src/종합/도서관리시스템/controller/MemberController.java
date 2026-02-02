package 종합.도서관리시스템.controller;

import 종합.도서관리시스템.model.dao.MemberDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance=new MemberController();
    public static MemberController getInstance(){return instance;}

    private MemberDao md= MemberDao.getInstance();

    public boolean signup(String mid, String mpw, String mtype){
        boolean result=md.signup(mid,mpw,mtype);
        return result;
    }

    private int loginSession=0;
    public int getLoginSession(){return loginSession;}
    public boolean login(String mid, String mpw){
        int result=md.login(mid,mpw);
        if(result>0){
            loginSession=result; return true;
        }
        return false;
    }

    public boolean logout(){
        loginSession=0;
        return true;
    }
}
