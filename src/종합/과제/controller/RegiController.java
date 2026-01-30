package 종합.과제.controller;

import 종합.과제.model.dao.RegiDao;
import 종합.과제.model.dto.RegiDto;

public class RegiController {
    private RegiController(){};
    private static final RegiController instance=new RegiController();
    public static RegiController getInstance(){
        return instance;
    }
    private RegiDao rd= RegiDao.getInstance();

    public boolean doRegist(String id, int pw, String name, String phone){
        return rd.doRegist(id, pw, name, phone);
    }

    public boolean doLogin(String id, int pw) {
    return rd.doLogin(id, pw);
    }
}
