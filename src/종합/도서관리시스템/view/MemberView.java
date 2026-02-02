package 종합.도서관리시스템.view;

import 종합.도서관리시스템.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance=new MemberView();
    public static MemberView getInstance(){return instance;}

    private MemberController mc= MemberController.getInstance();

    private Scanner scan=new Scanner(System.in);
    public void index(){
        for( ; ; ){
            System.out.print(" 1.회원가입ㅣ2.로그인 선택>");
            int ch=scan.nextInt();
            if(ch==1){signup();}
            else if(ch==2){login();}
        }
    }

    public void signup(){
        System.out.print("아이디: "); String mid=scan.next();
        System.out.print("비밀번호: "); String mpw=scan.next();
        System.out.print("유형: "); String mtype=scan.next();
        boolean result=mc.signup(mid,mpw, mtype); //임시
        if(result==true){
            System.out.println("회원가입 성공");}
        else{
            System.out.println("회원가입 실패");}
    }

    private BookView bv=BookView.getInstance();
    public void login(){
        System.out.print("아이디: "); String mid=scan.next();
        System.out.print("비밀번호: "); String mpw=scan.next();
        boolean result=mc.login(mid,mpw);
        if(result==true){
            System.out.println("로그인 성공");
            bv.index();}
        else{
            System.out.println("로그인 실패");}
    }
}
