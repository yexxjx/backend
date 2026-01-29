package 종합.예제5;

public class BoardController {

    // [1] private 외부접근차단, static 우선할당(객체없이), final(수정금지), boards 수정불가능, boards[0] 수정가능
    private static final Board[] boards=new Board [100];

    // [2] 기능1 : 저장 기능, public : 모든 프로젝트에서 호출 가능
    public static boolean doPost(String content, String writer) {
        Board board = new Board(content, writer); // 1. 생성자를 이용한 객체 생성
        // 2.인덱스 0부터 마지막인덱스 이하까지 1씩 증가하여 null 찾기
        for (int index = 0; index <= boards.length - 1; index++) {
            if (boards[index] == null) {
                boards[index] = board;
                return true; // 성공시 true(이름 설정은 맘대로)
            }
        } return false; // 실패시 false
    }

    // [3] 기능2 : 조회 기능
    public static Board[] doGet(){
        return boards;
    }

}
