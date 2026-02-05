package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {
        // [연동1 JDBC 클래스 호출] Class.forName("패키지명.JDBC클래스명");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 해당 클래스가 존재하면 동적으로 객체 생성

            // [연동2 DB서버 계정정보]
            // String url="jdbc:mysql://localhost:3306"
            // String user="계정명";
            // String password="계정비밀번호";  *띄어쓰기 금지
            String url="jdbc:mysql://localhost:3306/mydb0205";
            String user="root";
            String password="1234";

            // [연동3] Connection(1) java.sql 패키지
            // DriverManager.getConnection(C) 구현(객)체, *일반예외
            Connection conn= DriverManager.getConnection(url,user,password);
            System.out.println("======연동 성공======");

            // [연동 이후 DML(select insert update delete) 실행하기]
            String sql="insert into buy values(null,'BLK', '지갑','가죽',30,10 )"; // 실행 sql문법 문자열로 작성한다.
            PreparedStatement ps=conn.prepareStatement(sql); // prepareStatement(sql); SQL 기재
            int count=ps.executeUpdate(); // 기재된sql 실행 후 반영된 레코드 수 반환
            System.out.println("등록된 레코드는:"+count+"개 입니다.");


        }catch(ClassNotFoundException e){
            System.out.println("JDBC 클래스 호출 실패"); // 드라이버 클래스 연동 실패
        }catch(SQLException e){
            System.out.println("등록된 DB 서버로 연동 실패");
        }
    }
}