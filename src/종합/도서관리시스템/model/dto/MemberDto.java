package 종합.도서관리시스템.model.dto;

public class MemberDto {
    private int mno;
    private String mid;
    private String mpw;
    private String mtype;

    public MemberDto(int mno, String mid, String mpw, String mtype) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mtype = mtype;
    }

    public int getMno() {return mno;}
    public void setMno(int mno) {this.mno = mno;}
    public String getMid() {return mid;}
    public void setMid(String mid) {this.mid = mid;}
    public String getMpw() {return mpw;}
    public void setMpw(String mpw) {this.mpw = mpw;}
    public String getMtype() {return mtype;}
    public void setMtype(String mrole) {this.mtype=mtype;}

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mrole='" + mtype + '\'' +
                '}';
    }
}