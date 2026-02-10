package day12;

import 종합.예제7.model.dto.BoardDto;

public class Exam1 {
    public static void main(String[] args) {
        /*
        기본 타입 : byte short int long float double boolean char
        - 8개이면서 리터럴(상수-키보드로 입력받는)값을 분류하는 타입
        - 소문자로 시작함

        참조타입 : String, Scanner, MemberDto, [ ] 등
        - 기본 타입 외 모두 참조타입이다. 배열, 클래스, 인터페이스
        - 대문자로 시작함
        - 기본 타입 외 개발자가 새로운 타입 만드는 행위, 예) int.double 2개 갖는 타입
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

    }
}