package 종합.예제3;

import java.util.Scanner;

public class Boardservice3 {
    public static void main(String[] args) {

        // [1] Board 클래스 선언
        // [2] Board 객체 여러 개 저장=배열
        Board[ ] boards=new Board[100]; // 총 100개 배열 저장
        for( ; ; ){
            System.out.println("============= My Community ===========");
            System.out.println("1.게시물쓰기| 2.게시물출력");
            System.out.println("======================================");
            System.out.println("선택 > ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();
            if(ch==1){
                scan.nextLine();
                System.out.print("내용: "); String content=scan.nextLine();
                System.out.print("작성자: "); String name=scan.nextLine();
                // 객체 만들기
                Board board=new Board();
                // 생성한 객체에 입력받은 값 대입
                boolean check=false; // true:저장성공 false:저장실패
                board.내용=content; board.작성자=name;
                for(int index=0;index<=boards.length-1;index++){
                    if(boards[index]==null){ // 만약에 index번째 요소가 비어있으면
                        boards[index]=board; // 생성한 객체를 비어있는 index번째 요소에 대입
                        check=true; break;
                    }
                }
                if(check==true){
                    System.out.println("[안내] 글쓰기 성공");}
                else{
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");}

                // 지역변수란? { } 안에서 선언된 변수는 } 끝나면 사라진다. Board board=new Board();

            }else if(ch==2){
                for(int index=0;index<=boards.length-1;index++){
                    Board 게시물=boards[index]; // index번째 객체(게시물) 꺼내기
                    if(게시물!=null){
                        System.out.println("내용: "+게시물.내용);
                        System.out.println("작성자: "+게시물.작성자);
                        System.out.println("======================================");
                    }
                }

            }
        }
    }
}
