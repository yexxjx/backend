package day13;

import 종합.도서관리시스템.model.dto.BookDto;
import 종합.시험.Board;
import 종합.예제7.model.dto.BoardDto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    public static void main(String[] args) {
/*[문제 1] BookDto는 toString()을 오버라이딩하지 않고 BoardDto는 toString()을 오버라이딩하도록 만든 뒤 Object 타입
변수에 저장하여 두 객체를 하나의 출력문으로 출력했을 때 결과 차이가 나타나게 만드세요.
[출력예시]
day.BookDto@7cca494b | BoardDto{...}
*/
        Object o2=new BoardDto();
        System.out.println(o2.toString());

/*[문제 2] new String("유재석")으로 생성한 두 객체의 == 와 equals() 비교 결과를 하나의 출력문으로 나타나게 만드세요.
[출력예시]
== 비교:false, equals 비교:true
*/
        String str21=new String("유재석");
        String str22=new String("유재석");
        System.out.println(str21==str22);
        System.out.println(str21.equals(str22));

/*[문제 3] Class 리플렉션
1. String 객체를 하나 생성하고 getClass()를 이용하여 클래스 타입 정보를 가져오세요.
2. Class.forName("java.lang.String")을 사용하여 String 클래스를 직접 로드하세요.
3. 로드된 Class 객체에서 getMethods()를 사용하여 메소드 개수를 구하세요.
4. 위 결과들을 하나의 출력문으로 나타나게 만드세요.
[출력예시]
class java.lang.String | forName 성공 | method count:90
*/
        String str3=new String();
        Class c3=str3.getClass();
        try{
            Class.forName("java.lang.String");
            Method[] methods=c3.getMethods();
        }
        catch(ClassNotFoundException e){}



/*[문제 4] 문자열 "100"과 "3.14"를 각각 기본타입으로 변환하고 기본타입을 문자열로 변환하는 방법을 포함하여 하나의 출력문
으로 나타나게 만드세요.
[출력예시]
int:100, double:3.14, str1:"100", str2:"100"
*/
        int val1=Integer.parseInt("100");
        double val2=Double.parseDouble("3.14");
        String str1=100+"";
        String str2=3.14+"";

        System.out.println("int: "+val1+",double: "+val2+", str1: "+str1+", str2: "+str2);


/*[문제 5] LocalDateTime.now()로 현재 날짜/시간을 생성하고 지정된 포맷으로 변환 후 +10일, -30일 계산 결과를 하나의 출
력문으로 나타나게 만드세요.
[출력예시]
현재:2025년 07월 25일 11:43:11 | +10일:2025-08-04T11:43:11 | -30일:2025-06-25T11:43:11
*/
        LocalDateTime dateTime=LocalDateTime.of(2025,7,25,11,43,11);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        dateTime.format(formatter);
        LocalDateTime dateTime1=dateTime.plusDays(10);
        LocalDateTime dateTime2=dateTime.minusDays(30);
        System.out.println("현재: "+dateTime+"ㅣ+10일: "+dateTime1+"ㅣ-30일: "+dateTime2);
    }
}
