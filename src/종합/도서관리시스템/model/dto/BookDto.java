package 종합.도서관리시스템.model.dto;

public class BookDto {
    private int bno;
    private String bname;
    private int bprice;

    public BookDto(int bno, String bname, int bprice) {
        this.bno = bno;
        this.bname = bname;
        this.bprice = bprice;
    }

    public int getBno() {return bno;}
    public void setBno(int bno) {this.bno = bno;}
    public String getBname() {return bname;}
    public void setBname(String bname) {this.bname = bname;}
    public int getBprice() {return bprice;}
    public void setBprice(int bprice) {this.bprice = bprice;}

    @Override
    public String toString() {
        return "BookDto{" +
                "bno=" + bno +
                ", bname='" + bname + '\'' +
                ", bprice=" + bprice +
                '}';
    }
}
