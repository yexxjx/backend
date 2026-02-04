package 종합.회원제중고거래시스템.view;

import 종합.회원제중고거래시스템.controller.MemberController;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){ return instance; }

    private MemberController mc=MemberController.getInstance();

    private Scanner scan=new Scanner(System.in);
    public void index(){
        for( ; ; ){
            System.out.println("1. 회원가입 2. 로그인 선택>");
            int ch=scan.nextInt();
            if(ch==1){signup();}
            else if(ch==2){login();}
        }
    }

    public void signup(){
        System.out.println("아이디: "); String mid=scan.next();
        System.out.println("비밀번호: "); String mpw=scan.next();
        System.out.println("닉네임: "); String mname=scan.next();
        System.out.println("연락처: "); String mphone=scan.next();
        boolean result=mc.signup(mid,mpw,mname,mphone);
        if(result==true){
            System.out.println("회원가입 성공");}
            else{
            System.out.println("회원가입 실패");}
    }

    private ProductView pv=ProductView.getInstance();

    public void login(){
        System.out.println("아이디: "); String mid=scan.next();
        System.out.println("비밀번호: "); String mpw=scan.next();
        boolean result=mc.login(mid,mpw);
        if(result==true){
            System.out.println("로그인성공");
        pv.index();}
        else{
            System.out.println("로그인실패");}
    }
}
