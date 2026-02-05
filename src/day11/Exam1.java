package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 예외처리 : 개발자가 구현한 로직이나 사용자의 영향으로 문제
        // > 시스템오류 : 시스템이 종료되는 심각한 문제

        // [2] 예외종류
        // 1) 일반예외 : 컴파일(실행)될 때 예외 처리 코드 검사
        // 입출력, 네트워크, 파일, JDBC(DB연동) 등 주로 외부와 통신할 때
        // 2) 실행예외 : 컴파일(실행) 도중에 발생하는 예외 처리 코드 검사
        // 연산문제, null, index 등 주로 코드적인 문제, 타입 문제

        // [3] 목적 : 예외 고치는 게 아니라 예외가 발생하면 피해서 다른 코드로 이동, 즉) 24시간 코드 실행

        // [4] 사용법
        // try{예외가 발생하거나 발생할 것 같은 코드}
        // catch(발생한예외클래스명 변수명){만약에 예외 발생 했을 때 처리할 코드}
        // catch(발생한예외클래스명 변수명){만약에 예외 발생 했을 때 처리할 코드}
        // finally{예외 여부 상관없이 무조건 실행되는 코드}

        // [5] 주요 예외 클래스
        // 1. ClassNotFoundException : 클래스를 못 찾았을 때 발생하는 예외 클래스
        // 2. InterruptedException : 흐름(스레드)가 중단 되었을 때 발생하는 예외 클래스
        // 3. NullPointerException : 객체 NUll일 때 (.)접근연산자 사용시 발생하는 예외 클래스
        // 4. NumberFormatException
        // 5. ArrayIndexOutOfBoundsException
        // 6. InputMismatchException
        // 등등 모든 예외 클래스는 Exception 클래스로부터 상속받는다

        // 1) 일반 예외 예시1, Class.forName("패키지명.클래스명") : 현재 프로젝트 내 클래스가 존재하는 지 검사/동적할당
        try {
            Class.forName("java.lang.String2"); // String 클래스가 존재하는 지 확인
        } catch (ClassNotFoundException 변수명1) {
            System.out.println("예외발생1, String2 클래스가 없습니다.");
        }

        // 2) 일반 예외 예시2, Thread.sleep(밀리초) : 현재 흐름(스래드) 일시정지 메소드
        try {
            Thread.sleep(1000); // 현재 흐름(스레드) 1초간 일시 정지
        } catch (InterruptedException e2) {
            System.out.println("예외발생2 : 스레드 중단 발생 했습니다.");
        }
        // 일반 예외 클래스들은 실행 전에 코드 밑줄에 빨강색으로 예외 발생 가이드라인 해준다

        // 3) 실행 예외 예시3, NullPointerException
        try {
            String name = null;
            System.out.println(name.length()); // (접근/도트) 연산자는 객체가 존재해야만 가능
        } catch (NullPointerException error) {
            System.out.println("에외발생3 : null은 메소드를 호출할 수 없다.");
        }

        // 4) 실행 예외 예시4, NumberFormatException
        try {
            String str1 = "100";
            String str2 = "1abc";
            int int1 = Integer.parseInt(str1); // Integer.parseInt(문자열) : 문자열 > 정수타입 반환 메소드
            int int2 = Integer.parseInt(str2); // "100" > 100 ok, "1abc" > 1abc not ok, NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("예외발생4 : 정수 타입으로 반환이 불가능하다.");
        }

        // 5) 실행 예외 예시5, ArrayIndexOutOfBoundsException
        try {
            int[] ary = {1, 2, 3};
            System.out.println(ary[2]); // 2번 인덱스 값은 3
            System.out.println(ary[3]); // 3번 인덱스 값은 없음
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외발생5 : 존재하지 않는 인덱스 입니다.");
        }

        // 6) 실행 예외 예시6, InputMismatchException
        try {
            Scanner scan = new Scanner(System.in);
            int value = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("예외발생6 : 입력할 수 없는 정보 또는 잘못된 형식입니다. ");
        }

        // 7) 예외는 다양한 이유로 발생한다. 에외 중에 상위(부모)클래스가 존재한다. Exception 클래스
        try {
        }catch(NumberFormatException e2){
            System.out.println(e2);
        }catch(NullPointerException e1) {
            System.out.println(e1);
        }catch(Exception e) { // 모든 예외에 대해 처리해주는 상위 클래스, 다중 catch 할 경우 가장 마지막에 사용
            System.out.println(e);
        }finally {
            System.out.println("예외 발생 여부 상관없이 무조건 실행되는 구역");
        }


    }
}
