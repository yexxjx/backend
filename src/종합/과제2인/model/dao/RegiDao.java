package 종합.과제2인.model.dao;

import 종합.과제2인.model.dto.RegiDto;

import java.util.ArrayList;

public class RegiDao {
    private RegiDao(){}
    private static final RegiDao instance=new RegiDao();
    public static RegiDao getInstance(){
        return instance;
    }
    private final ArrayList<RegiDto> regis=new ArrayList<>();

    private static int currentNo=1;
    public boolean doRegist(String id, int pw, String name, String phone){
        RegiDto regiDto=new RegiDto(currentNo, id, pw, name, phone);
        boolean result=regis.add(regiDto);
        currentNo++;
        return result;
    }

    public boolean doLogin(String id, int pw){
        for(int index=0; index<=regis.size()-1;index++){
            if(regis.get(index).getId().equals(id)&&regis.get(index).getPw()==(pw)){
                return true;
            }
        } return false;
    }

}
