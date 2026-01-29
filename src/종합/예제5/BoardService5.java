package 종합.예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {
        // [1] controller 객체
        // [2]

        for( ; ; ) {
            System.out.println("============= My Community ===========");
            System.out.println("1.게시물쓰기| 2.게시물출력");
            System.out.println("======================================");
            System.out.println("선택 > ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();

            if (ch == 1) {
                scan.nextLine();
                System.out.println("내용: "); String content=scan.nextLine();
                System.out.println("작성자: "); String writer=scan.nextLine();
                // BoardController.dopost() : static메소드(클래스명.메소드명()) vs bc.doPost() : 메소드(객체명.메소드명())
                boolean result=BoardController.doPost(content, writer);
                if(result){
                    System.out.println("[안내] 글쓰기 성공");}
                    else{
                    System.out.println("[경고] 글쓰기 실패");}

            } else if (ch == 2) {
                        Board[] boards=BoardController.doGet();
                        for(Board board:boards){
                            if(board!=null)// board.writer 직접접근 vs ㅠboard.getWriter() 간접접근
                        System.out.printf("작성자:%s, 내용:%s \n", board.getWriter(), board.getContent());
                    }


            }
        }
    }
}
