package 종합.도서관리시스템.view;

import 종합.도서관리시스템.controller.BookController;
import 종합.도서관리시스템.controller.MemberController;
import 종합.도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    private BookView(){}
    private static final BookView instance=new BookView();
    public static BookView getInstance(){return instance;}

    private BookController bc=BookController.getInstance();

    private MemberController mc=MemberController.getInstance();
    private Scanner scan=new Scanner(System.in);
    public void index(){
        for( ; ; ){
            System.out.println("1.도서등록ㅣ2.도서전체조회ㅣ3.로그아웃 선택>");
            int ch=scan.nextInt();
            if(ch==1){add();}
            else if(ch==2){findAll();}
            else if(ch==3){mc.logout();break;}
        }
    }

    public void add(){
        System.out.print("도서명: "); String bname=scan.next();
        System.out.print("도서가격: "); int bprice=scan.nextInt();
        boolean result=bc.add(bname,bprice);
        if(result){
            System.out.println("도서 등록 성공");}
        else{
            System.out.println("도서 등록 실패");}
    }

    public void findAll(){
        ArrayList<BookDto> bookDtos=bc.findAll();
        System.out.println("가져온 데이터 개수: " + bookDtos.size());
        for(int index=0; index<=bookDtos.size()-1;index++){
            BookDto bookDto=bookDtos.get(index);
            System.out.printf("제품번호:%dㅣ%sㅣ%d \n",
                    bookDto.getBno(),bookDto.getBname(),
                    bookDto.getBprice());
        }
    }

}
