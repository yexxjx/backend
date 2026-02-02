package 종합.도서관리시스템.controller;

import 종합.도서관리시스템.model.dao.BookDao;
import 종합.도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;

public class BookController {
    private BookController(){}
    private static final BookController instance=new BookController();
    public static BookController getInstance(){return instance;}

    private BookDao bd= BookDao.getInstance();

    public boolean add(String bname, int bprice){
        boolean result=bd.add(bname,bprice);
        return result;
    }

    public ArrayList<BookDto> findAll(){
        ArrayList<BookDto> result=bd.findAll();
        return result;
    }
}
