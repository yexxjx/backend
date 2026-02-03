package 종합.과제1.model.dto;

public class WaitingDto {
    private int no;
    private String phone;
    private int people;

    public WaitingDto(){}
    public WaitingDto(int no, String phone, int people) {
        this.no = no;
        this.phone = phone;
        this.people = people;
    }

    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public int getPeople() {return people;}
    public void setPeople(int people) {this.people = people;}

    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phone='" + phone + '\'' +
                ", people=" + people +
                '}';
    }
}
