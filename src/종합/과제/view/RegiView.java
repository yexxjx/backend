package 종합.과제.view;

import 종합.과제.controller.RegiController;
import 종합.과제.model.dto.RegiDto;

import java.util.ArrayList;
import java.util.Scanner;

public class RegiView {
    private RegiView(){}
    private static final RegiView instance=new RegiView();
    public static RegiView getInstance(){
        return instance;
    }
    private RegiController rc= RegiController.getInstance();

    private Scanner scan = new Scanner(System.in);
    public void writeView() {
        scan.nextLine();
        String id = scan.nextLine();
        System.out.println("아이디: ");
        int pw = scan.nextInt();
        System.out.println("비밀번호: ");
        String name = scan.nextLine();
        System.out.println("닉네임: ");
        String phone= scan.nextLine();
        System.out.println("전화번호: ");
        boolean result = rc.doRegist(id, pw, name, phone);
        if (result) {
            System.out.println("[안내] 회원가입 완료");
        } else {
            System.out.println("[안내] 회원가입 실패");
        }
    }

    public void LoginView(){
        String id = scan.nextLine();
        System.out.println("아이디: ");
        int pw = scan.nextInt();
        System.out.println("비밀번호: ");
        boolean result=rc.doLogin(id,pw);
        if(result) {
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");}
    }



}
