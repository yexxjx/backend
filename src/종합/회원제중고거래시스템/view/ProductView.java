package 종합.회원제중고거래시스템.view;

import 종합.회원제중고거래시스템.controller.MemberController;
import 종합.회원제중고거래시스템.controller.ProductController;
import 종합.회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){ return instance; }

    private ProductController pc=ProductController.getInstance();

    private MemberController mc= MemberController.getInstance();
    private Scanner scan=new Scanner(System.in);
    public void index(){
        for( ; ; ) {
            System.out.println("1.제품등록 2.제품전체조회 3.로그아웃 선택>");
            int ch = scan.nextInt();
            if (ch == 1) {add();
            } else if (ch == 2) {findAll();
            } else if (ch == 3) {
                mc.logout();
                break;
            }
        }
    }

    public void add(){
        System.out.println("제품명:"); String pname=scan.next();
        System.out.println("제품가격:"); int pprice=scan.nextInt();
        System.out.println("제품설명:"); String pcomment=scan.next();
        boolean result=pc.add(pname,pprice,pcomment);
        if(result){
            System.out.println("제품등록성공");}
        else{
            System.out.println("제품등록실패");}
    }

    public void findAll( ){
        ArrayList<ProductDto> productDtos = pc.findAll();
        for( int index = 0 ; index <= productDtos.size()-1 ; index++ ){
            ProductDto productDto = productDtos.get( index );
            System.out.printf("제품번호 : %d | %s | %d | 판매자 : %s \n" ,
                    productDto.getPno() , productDto.getPname() ,
                    productDto.getPprice() , productDto.getMname());
        }
    }
}
