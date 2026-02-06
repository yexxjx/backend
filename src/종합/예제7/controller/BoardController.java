package 종합.예제7.controller;

import 종합.시험.Board;
import 종합.예제7.model.dao.BoardDao;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance=new BoardController();
    public static BoardController getInstance() {return instance;}

    private BoardDao bd= BoardDao.getInstance();

    // [1] 게시물 등록
    public boolean write(String bcontent, String bwriter){
        boolean result=bd.write(bcontent, bwriter);
        return result;
    }

    // [2] 게시물 삭제
    public boolean delete(int bno){
        boolean result=bd.delete(bno);
        return result;
    }

    // [3] 게시물 수정
    public boolean update(int bno, String bcontent){
        boolean result=bd.update(bno, bcontent);
        return result;
    }

    // [4] 게시물 전체 조회, 여러 개 레코드 조회>ArrayList, 한 개 레코드 조회>Dto
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result=bd.findAll();
        return result;
    }
}
