package 종합.예제7.view;

import 종합.예제7.controller.BoardController;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance=new BoardView();
    public static BoardView getInstance(){return instance;}

    private BoardController bc= BoardController.getInstance();

    public Scanner scan=new Scanner(System.in);
    public void index() {
        for (; ; ) {
            try {
                System.out.println("============= My Community ===========");
                System.out.println("1.게시물쓰기|2.게시물출력ㅣ3.게시물삭제ㅣ4.게시물수정");
                System.out.println("======================================");
                System.out.println("선택 > ");
                int ch = scan.nextInt();
                if (ch == 1) {write();}
                else if (ch == 2) {findAll();}
                else if (ch == 3) {delete();}
                else if (ch == 4) {update();}
                else {
                    System.out.println("[경고] 없는 기능 번호입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[경고] 잘못된 입력 방식입니다. [재입력]");
                scan = new Scanner(System.in);
            } catch (Exception e) { // Exception 예외 중 슈퍼클래스로 모든 예외 처리 가능
                System.out.println("[시스템오류] 관리자에게 문의");
            }
        }
    }
    // [1] 게시글 등록
    public void write(){
        scan.nextLine();
        System.out.println("내용: "); String bcontent=scan.nextLine();
        System.out.println("작성자: "); String bwriter=scan.next();
        boolean result = bc.write(bcontent,bwriter);
        if(result){
            System.out.println("[안내] 게시물 등록 안내");}
        else{
            System.out.println("[경고] 게시물 등록 실패");}
    }

    // [2] 게시글 삭제
    public void delete(){
        System.out.println("삭제할 게시물 번호");
        int bno=scan.nextInt();
        boolean result=bc.delete(bno);
        if(result){
            System.out.println("[안내] 게시물 삭제 성공");}
        else{
            System.out.println("[경고] 게시물 삭제 실패 또는 없는 게시물 번호 입니다.");}
    }

    // [3] 게시물 수정
    public void update(){
        System.out.println("수정할 게시물 번호"); int bno=scan.nextInt();
        scan.nextLine();
        System.out.println("수정할 내용"); String bcontent=scan.nextLine();
        boolean result=bc.update(bno, bcontent);
        if(result){
            System.out.println("[안내] 게시물 수정 성공");}
        else{
            System.out.println("[경고] 게시물 수정 실패 또는 없는 게시물 번호 입니다.");}
    }

    // [4] 게시물 전체 조회
    public void findAll(){
        ArrayList<BoardDto> boards=bc.findAll();
        for(BoardDto board:boards){
            System.out.printf("번호:%d, 내용: %s, 작성자: %s, 작성일: %s\n", board.getBno(), board.getBdate(), board.getBwriter(), board.getBcontent());
        }
    }
}
