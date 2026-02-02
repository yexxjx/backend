package 종합.도서관리시스템.model.dao;

import 종합.도서관리시스템.model.dto.BookDto;

import java.util.ArrayList;

public class BookDao {
    private BookDao(){}
    private static final BookDao instance=new BookDao();
    public static BookDao getInstance(){return instance;}

    private static ArrayList<BookDto> bookDtos=new ArrayList<>();

    private int currentBno=1;
    public boolean add(String bname, int bprice){
        BookDto bookDto=new BookDto(currentBno, bname,bprice);
        boolean result=bookDtos.add(bookDto);
        if(result){currentBno++;}
        return result;
    }

    public ArrayList<BookDto> findAll(){return bookDtos;}
}
