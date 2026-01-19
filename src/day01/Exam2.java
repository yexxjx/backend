package day01; //패키지(폴더) 클래스가 위치한 폴더명
public class Exam2 {
    // pubic class : 공개용 클래스를 선언하는 뜻 갖는 키워드
    // Exam2 : 임의의 클래스명 정의한다. 첫글자 대문자!




    // [1] m+엔터 : main함수
    // 자바에서 최초로 실행 흐름(스레드)를 갖는 (미리 만들어진)함수
    public static void main(String[] args) {
        // [2] 리터럴 : 실수이면서 키보드로 입력 가능한 자료들
        // 3, 3.14, "R", "유재석"
        System.out.println(3); // JS의 console.log() 동일한 기능의 함수
        System.out.println(3.14); // sout+엔터 : System.out.println(출력자료);
        System.out.println("R"); // 선언 또는 함수 시행 뒤에 ;세미콜론 작성
        System.out.println("유재석"); //

        // [3]  자료형/타임(분류) 자료들을 효율적으로 사용하기 위한 분류 방법
        // 바이트란? bit(0 혹은 1) > 01010101(8bit/bit8개)=1byte
        // 효율이란? 부모님한테 시계 선물하기 위해 다이소에서 시계 크기에 맞는 적당한 상자를 고른다
        // 정수 : byte(1b,-128~127), short(2, +-3만),
        //       int(4,+-2억, *정수타입*), long(8, +-21억 이상)
        // 실수 : float(4, 소수점 8자리), double(8, 소수점 17자리 표현, *실수기본*)
        // 문자 : char(2, '' 작은 따옴표 감싼), 문자열 : String(문자열클래스, "" 큰 따옴표 감싼)
        // 논리 : boolean(1, true/false)

        // 1. boolean : true 또는 false 저장하는 타입
        boolean bool1=true; //[JAVA] 자료형 변수명=값; [동적타입] let bool1=true;
        boolean bool2=false; // 변수명은 카멜표기법 권장, 숫자시작/일부특수/뛰어쓰기 안됨
        // boolean bool3=3; // [오류] boolean은 3을 저장할 수 없다.
        System.out.println(bool1);
        System.out.println(bool2);

        // 2. char : '' 작은따옴표로 감싼 문자 1개 저장하는 타입
        char ch1='A';
        // char ch2='ABC'; [오류] 문자 여러 개 불가능
        // char ch3="A"; [오류] 큰 따옴표 불가능
        System.out.println(ch1);

        // 3. String : "" 큰 따옴표로 감싼 문자 여러 개 저장하는 (클래스) 타입
        String str1="ABC";
        System.out.println(str1);

        // 4. byte : -128 ~ +127
        byte b1=100;
        // byte b2=300; [오류]
        System.out.println(b1);

        // 5. short : +-3만정도
        short s1=32000;
        // short s2=40000;
        System.out.println(s1);

        // 6. int : +-21억정도, 정수의 리터럴 기본 타입, 즉) 키보드로부터 입력받은 값들은 int 타입이다.
        int i1=2100000000;
        // int i2=3000000000; [오류]
        System.out.println(i1);

        // 7. long : +-21억이상, 리터럴 뒤에 L/l 붙인다.
        long l1=3000000000L; // 3000000000 리터럴 값은 INT 타입이라서 뒤에 L을 명시함
        System.out.println(l1);

        // 8. double : 소수점 포함한 17자리 표현, 실수의 리터럴 기본 타입
        double d1=0.123456789123456789;
        System.out.println(d1);

        // 9. float : 소수점 포함한 8자리 표현, 리터럴 뒤에 F/f 붙인다.
        float f1=0.123456789123456789F;
        System.out.println(f1);

        // 소수점 오차가 발생하거나 표현 한계로 실무에서 사용 제약 (String, BigDecimal 사용)

    }
}

/*
 ====코드 작성====                ====코드 실행====
 JS : console.log("자바");        브라우저
 JAVA : print("자바");            main
*/