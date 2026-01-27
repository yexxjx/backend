package 종합.시험;

import java.util.Scanner;

public class Boardservice {
    public static void main(String[] args) {
        BoardController bs=new BoardController();
        for( ; ; ){
            System.out.println("=======My Community=======");
            System.out.println("1.게시물쓰기ㅣ2.게시물출력");
            System.out.println("==========================");
            System.out.println("선택>");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();

            if(ch==1){
                scan.nextLine();
                System.out.println("작성자: "); String writer=scan.nextLine();
                System.out.println("내용: "); String content=scan.nextLine();

                boolean result=bs.doPost(writer, content);
                if(result==true){
                    System.out.println("[안내] 등록 성공");
                }else{
                    System.out.println("[경고] 등록 실패");}
            }else if(ch==2){
                Board [] boards= bs.doGet();
                for(int index=0; index<=boards.length-1;index++){
                    if(boards[index]!=null){
                        System.out.println("작성자: "+boards[index].writer);
                        System.out.println("내용: "+boards[index].content);
                        System.out.println("----------------------------");
                    }
                }
            }
        }
    }
}
