package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) { // main

        // [1] 입력객체
        // Scanner 클래스 : 입력받은 자료들을 특정한 타입으로 변환
        // new : 객체 생성할 때 사용되는 키워드
            // new Scanner : Scanner 객체 만들겠다.
        // (System.in) : 시스템 입력 객체를 Scanner 객체에게 전달
        // * 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // * Scanner 변수=new Scanner(System.in);
        Scanner 입력변수=new Scanner(System.in);

        // [2] 입력함수
        // 1. .next();  : 입력받은 자료를 문자열(String)로 반환, 띄어쓰기 불가능
        System.out.print("1.next():"); // 입력 전 가이드
        String str1=입력변수.next(); // console에서 키보드로부터 입력받고 enter 입력 시 입력 종료
        System.out.println(str1);

        // 2. .nextline(); : 입력받은 자료를 문자열(String)로 반환, 띄어쓰기 포함
        // 주의할 점 : 띄어쓰기를 포함하다보니 앞next와 충돌하여 하나의 next 인식 됨
        // 해결 방법 : nextLine() 사용할 때 앞 next() 존재하면 임의의 nextLine() 하나 더 작성하기
        입력변수.nextLine();
        System.out.println("2.nextLine():");
        String str2=입력변수.nextLine();
        System.out.println(str2);

        // 3. .nextByte() : 입력받은 자료를 바이트로 반환, -128~127 외의 자료이면 오류 발생
        System.out.print("3.nextByte() :");
        byte b1=입력변수.nextByte();
        System.out.println(b1);

        // 4. .nextShort() : 입력받은 자료를 쇼트로 반환, +-3만 외의 자료이면 오류 발생
        System.out.print("4.nextShort() :");
        short s1=입력변수.nextShort();
        System.out.println(s1);

        // 5. .nextInt() : 입력받은 자료를 인트로 반환, +-21억 외의 자료이면 오류 발생
        System.out.print("5.nextInt() :");
        int i1=입력변수.nextInt();
        System.out.println(i1);

        // 6. nextLong() : 입력받은 자료를 롱으로 반환, +-21억이상 외의 자료이면 오류 발생
        System.out.print("6.nextLong() :");
        long l1=입력변수.nextLong();
        System.out.println(l1);

        // 7. nextFloat() : 입력받은 자료를 실수로 반환
        System.out.print("7. nextFloat() :");
        Float f1=입력변수.nextFloat();
        System.out.println(f1);

        // 8. nextDouble() : 입력받은 자료를 실수로 반환
        System.out.print("8. nextDouble() :");
        Double d1=입력변수.nextDouble();
        System.out.println(d1);

        // 9. nextBoolean : 입력받은 자료를 불리언으로 반환,
        System.out.print("9. nextBoolean() :");
        Boolean b2=입력변수.nextBoolean();
        System.out.println(b2);

        // 10. next().charAt(0) : 입력받은 잘에서 첫번재 글자 변환, char 문자 스
        System.out.print("10. next().charAt(0)(): ");
        char c1=입력변수.next().charAt(0);
        System.out.println(c1);
    }
}
