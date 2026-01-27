package 종합.시험;

public class BoardController {
    Board[] boards=new Board[100];
    boolean doPost(String content,String writer){
        Board board=new Board();
        board.writer=writer; board.content=content;

        for(int index=0; index<=boards.length-1;index++){
            if(boards[index]==null){
                boards[index]=board;
                return true;
            }
        } return false;
    }
    Board [] doGet() {return boards;}
}
