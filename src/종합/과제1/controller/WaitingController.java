package 종합.과제1.controller;

import 종합.과제1.model.dao.WaitingDao;
import 종합.과제1.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){};
    private static final WaitingController instance=new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    private WaitingDao wd=WaitingDao.getInstance();
    public boolean doPost(String phone, int people){
        boolean result=wd.doPost(phone, people);
        return result;
    }

    public ArrayList<WaitingDto> doGet(){
        ArrayList<WaitingDto> result=wd.doGet();
        return result;
    }
}
