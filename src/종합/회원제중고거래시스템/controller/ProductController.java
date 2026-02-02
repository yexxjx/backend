package 종합.회원제중고거래시스템.controller;

import 종합.회원제중고거래시스템.model.dao.MemberDao;
import 종합.회원제중고거래시스템.model.dao.ProductDao;
import 종합.회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){ return instance; }

    private ProductDao pd= ProductDao.getInstance();

    public boolean add(String pname, int pprice, String pcomment){
        int loginMno=MemberController.getInstance().getLoginSession();
        boolean result=pd.add(pname,pprice,pcomment,loginMno);
        return result;
    }

    public ArrayList<ProductDto> findAll(){
        ArrayList<ProductDto> result=pd.findAll();
        for(int index=0;index<=result.size()-1;index++){
            ProductDto productDto=result.get(index);
            String mname= MemberDao.getInstance().findMname(productDto.getMno());
            productDto.setMnam(mname);
        }
        return result;
    }
}