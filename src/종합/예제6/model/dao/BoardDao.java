package 종합.예제6.model.dao;

import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao() {
    }

    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance() {return instance;}

    // [*] 데이터 베이스 역할 하는 ArrayList <추후에 삭제 예정>
    private  static final ArrayList<BoardDto> boards = new ArrayList<>();

    // [*] 전역변수에 최신 게시물 번호 저장 <식별키 생성 목적 : 추후에 삭제 예정>
    private static int currentNo=1; // 초기값1

    // 1) 등록 처리 : controller가 dao에게 content와 writer 전달하여 등록 요청
    public boolean doPost(String content, String writer) {
        // 1. 매개변수에 따른 객체를 만든다. + 게시물 번호 자동 생성
    BoardDto boardDto=new BoardDto(currentNo, content, writer);
        // 2. .add (새로운 값); 저장하면 true, 실패하면 false 반환하는 기능/함수/메소드
        boolean result = boards.add(boardDto);
        currentNo++; // 다음 저장할 게시물의 번호를 1증가 한다
        // 3. 저장 성공여부를 controller에게 반환
        return result;
    }
    // 2) 전체 조회 처리 : controller가 dao에게 모든 게시물들을 요청한다
    // 개별 조회 1개 반환 타입 : BoardDto vs 전체 조회 N개 반환 타입 Arraylist<BoardDto>

    public ArrayList<BoardDto> doGet(){
        return boards;
    }
}
