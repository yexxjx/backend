package 종합.예제4;

// 게시물 기능
public class BoardController {
    // 속성 : 멤버변수
    Board [ ] boards=new Board[100];
    // 기능 : 메소드
    boolean doPost(String content, String writer){
        Board board=new Board(); // 1. 객체 생성
        board.content=content; // 2. 매개변수로 받은 값 저장
        board.writer=writer;
        for(int index=0;index<=boards.length-1;index++){
            if(boards[index]==null) { // index번째 요소가 비어있으면
                boards[index] = board; // 배열의 새로운 객체 저장
                return true; // 함수 종료 의미, true 반환 했으므로 return 타입은 boolean
            }
        }
        return false;
    }
    Board[] doGet(){
        return boards;} // boards 반환했으므로 return 타입은 boards 변수의 Board[]
}
