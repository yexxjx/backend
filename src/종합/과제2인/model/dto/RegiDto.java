package 종합.과제2인.model.dto;

public class RegiDto {
    private int no;
    private String id;
    private int pw;
    private String name;
    private String phone;

    public RegiDto(int no, String id, int pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {this.pw = pw;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "RegiDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pw=" + pw +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
