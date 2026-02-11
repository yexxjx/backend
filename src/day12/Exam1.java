package day12;

import 종합.예제7.model.dto.BoardDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam1 {
    public static void main(String[] args) {
        /*
        기본 타입 : byte short int long float double boolean char
        - 8개이면서 리터럴(상수-키보드로 입력받는)값을 분류하는 타입
        - 소문자로 시작함

        참조타입 : String, Scanner, MemberDto, [ ] 등
        - 기본 타입 외 모두 참조타입이다. 배열, 클래스, 인터페이스
        - 대문자로 시작함
        - 기본 타입 외 개발자가 새로운 타입 만드는 행위, 예) int/double 2개 갖는 타입
         */
        // 자바 회사에서 제공하는 기본 클래스 등
        // [1] Object : 자바에서 최상위 클래스이면서 모든 클래스는 Object로 부터 상속받는다.
        Object o1=3; // 기본타이어=한국타이어
        Object o2=3.14;
        Object o3=true;
        Object o4="유재석";
        Object o5=new Object();
        Object o6=new int[3];
        Object o7=new BoardDto(); // 종합 예제7에서 만든 거
        // 즉) 모든 자료들은 Object로 타입 변환(다형성)이 가능
            // 1-1) .toString( ) : 인스턴스/자료 주소값(메모리위치) 반환 함수
        System.out.printf(o6.toString()); // [I@3b9a45b3, 이와 같이 할당된 주소값(개발자가 제어 불가능)
        System.out.printf(o7.toString()); // BoardDto[ ], 이와 같이 toString 오버라이딩 한 객체는 문자말 출력
            // 1-2) .equals( ) : 주소가 참조하는 객체 비교 VS == 변수가 갖는 주소(위치)또는 리터럴 비교
        Object o8=new BoardDto();
        Object o9=new BoardDto();
        // System.out.printf(o8==o9); false
        // System.out.printf(o8.equals(o9)); false
        Object o10=o9;    // 객체 참조 복사/복제
        System.out.println(o10==o9); // true
        System.out.println(o10.equals(o9)); // true

        String str1=new String("유재석");
        String str2=new String("유재석");
        // System.out.printf(str1==str2); false 서로 다른 객체가 같은 문자열을 갖는다
        System.out.println(str1.equals(str2)); // true 서로 다른 객체 내 문자열을 비교

        // 1-3) hashCode( ) : 객체를 식별하는 값을 정수로 반환
        System.out.println(str1.hashCode()); // 50621969
        System.out.println(str2.hashCode()); // 50621969
        System.out.println(o10.hashCode()); // 1338668845
        System.out.println(o9.hashCode()); // 1338668845
        System.out.println(o8.hashCode()); // 159413332

        // [2] Class : 클래스 정보(멤버변수/메소드 등등) 담는 클래스
        String obj1=new String();
        Class c1=obj1.getClass();
        System.out.println(c1); // class java.lang.String

        Integer obj2=3;
        Class c2=obj2.getClass();
        System.out.println(c2); // class java.lang.Integer

        // 2-1) Class.forName("패키지명.클래스명");, 일반예외
        // *** 리플랙션 *** : 최초 실행(컴파일) 할 때 객체를 생성하지 않음 실행 도중에 객체 생성=동적 처리
        // 사용처 : JDBC(db연동), 스프링프레임워크(자바플랫폼) = 외부 라이브러리 동적 객체 생성
        try{Class.forName("class java.lang.String");} // String 클래스가 존재하면 객체가 동적으로 생성한다
        catch(ClassNotFoundException e){ }

        // 2-2)
        Field[] fields=c1.getFields(); // 객체 내 모든 멤버변수/속성/필드 명 확인(*private 제외)
        for(int i=0; i<fields.length; i++){
            System.out.println(fields[i]);
        }

        Constructor[] constructors=c1.getConstructors(); // 클래스 내 모든 생성자 확인(매개변수 확인)
        for(int i=0; i<constructors.length; i++){
            System.out.println(constructors[i]); // 15개, 오버로딩 이용한 다수의 생성자
        }

        Method[] methods=c1.getMethods(); // 클래스 내 모든 메소드 확인
        for(int i=0; i< methods.length; i++){
            System.out.println(methods[i]); // 모든 메소드 전부 나옴
        }

        // [3] 래퍼 클래스 : 기본 타입 > 참조타입으로 표현, 장점 : 기본 타입은 메소드가 없다
        int value1=100; // 자료는 100, 분류/타입 int
        Integer value2=100; // 자료는 100, 분류/타입 Integer
        // System.out.println(value1.toString());
        System.out.println(value2.toString()); // Integer 참조타입으로 기능(메소드)이 있음
        // 3-1) 언박싱과 오토박싱
        int value3=value2; // Integer > int 언박싱, 참조 타입 > 기본 타입
        Integer value4=value1; // int > Integer 오토박싱, 기본 타입 > 참조 타입

        // 자바에서 외부 자료들과 자료들을 주고 받을 때 타입 변환 (엑셀/CSV/공공데이터API/JS통신/PYTHON통신)
        int val1=Integer.parseInt("100"); // 문자 "100"을 숫자 100으로 타입 변환
        double val2=Double.parseDouble("3.14"); // 문자 "3.14"를 숫자 3.14로 타입 변환
        float val3=Float.parseFloat("3.14"); // 문자 "3.14"를 숫자 3.14로 타입 변환
        boolean val4=Boolean.parseBoolean("true"); // 문자 "true"를 true로 타입 변환

        // 기본 타입 > 문자열 변환
        String s1=100+""; // 기본타입자료+"" 100 > "100"
        String s2=String.valueOf(100); // 100 > "100"
        System.out.println(s1);
        System.out.println(s2);

    }
}