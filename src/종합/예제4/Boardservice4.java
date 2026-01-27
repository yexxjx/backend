package 종합.예제4;

import java.util.Scanner;

// 실행클래스 : 입출력 용도
public class Boardservice4 {
    public static void main(String[] args) {
        BoardController bs=new BoardController();
        for( ; ; ){ // [1] 반복문
            System.out.println("============= My Community ===========");
            System.out.println("1.게시물쓰기| 2.게시물출력");
            System.out.println("======================================");
            System.out.println("선택 > ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();

            if(ch==1){
                scan.nextLine();
                System.out.print("작성자: "); String writer=scan.nextLine();
                System.out.print("내용: "); String content=scan.nextLine();
                // BoardController에 저장 기능을 호출하여 저장 결과 받기
                // BoardController bc=new BoardController(); 2번 들어가게 되면 결과 값이 안나옴. for 반복문 밖으로 빼야됨
                boolean result=bs.doPost(content, writer);
                if(result==true){
                    System.out.println("[안내] 등록 성공");
                }else{
                    System.out.println("[경고] 등록 실패");}



            }else if(ch==2){
                // BoardController의 조회 기능을 호출하여 조회 결과 받기
                // BoardController bc=new BoardController();
                Board[] boards=bs.doGet();
                for(int index=0; index<=boards.length-1; index++){
                    if(boards[index]!=null){
                        System.out.println("작성자: "+boards[index].writer);
                        System.out.println("내용: "+boards[index].content);
                        System.out.println("----------------------------------");
                    }
                }

            }
        }
    }
}