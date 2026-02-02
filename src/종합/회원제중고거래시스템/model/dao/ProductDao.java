package 종합.회원제중고거래시스템.model.dao;

import 종합.회원제중고거래시스템.model.dto.MemberDto;
import 종합.회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao(){}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){ return instance; }

    private ArrayList<ProductDto> productDtos=new ArrayList<>();

    private int currentPno = 1;
    public boolean add( String pname , int pprice , String pcomment, int loginMno ){
        ProductDto productDto = new ProductDto( currentPno, pname , pprice , pcomment, loginMno );
        boolean result = productDtos.add( productDto );
        if( result ){ currentPno++; }
        return result;
    }
    public ArrayList<ProductDto> findAll(){
        return productDtos;
    }
}
