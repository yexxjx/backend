package day03;

import org.w3c.dom.ls.LSOutput;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 조건문 if, 만약에~, 경우의 수
        // (1) if(조건문) 실행문;
        int 온도=5;
        if (온도<=10) System.out.println("외투 입니다.");

        // (2) if(조건문) {실행문; 실행문;}
        int 나이=10;
        if (나이>=19) {
            System.out.println("성인 입니다.");
            System.out.println("19세 입니다.");
        }

        // (3)  if(조건문) {실행문;} else{실행문;}
        boolean 회원검사=false;
        if (회원검사==true) {
            System.out.println("안녕하세요. 회원님");
        } else {
            System.out.println("비회원 입니다.");
        }

        // (4) if(조건문) {실행문;} else if(조건문){실행문} else if(조건문){실행문}
        int 지갑돈=1750;
        if (지갑돈>=3000) {
            System.out.println("택시를 탄다.");
        } else if (지갑돈>=1700) {
            System.out.println("버스를 탄다.");
        } else if (지갑돈>=1200) {
            System.out.println("전기자전거를 탄다.");
        } else {
            System.out.println("걸어간다.");
        }

        // ↑ 여러 조건에 따른 하나의 실행문 갖는다. vs ↓ 여러 조건에 따른 여러 실행문 갖는다
        if (지갑돈>=3000) {
            System.out.println("택시를 탄다.");
        }
        if (지갑돈>=1700) {
            System.out.println("버스를 탄다.");
        }
        if (지갑돈>=1200) {
            System.out.println("전기자전거를 탄다.");
        }
        if (지갑돈<1200) {
            System.out.println("걸어간다.");
        }

        // (5)
        int age=25;
        char gender = 'w';
        if (age>=19) {
            System.out.println("성인");
            if (gender=='w') {
                System.out.println("성인여자");
            } else {
                System.out.println("성인남자");
            }
        } else {
            System.out.println("미성년자");
        }

        // (6) switch : 논리 검사보다는 값에 따른 흐름 제어 사용
        char grade = 'B';
        switch (grade) { // switch에 등급을 대입하고
            case 'A': // 만약에 A등급이면              case가 일치하면 실행된다. 아래 case 모두 실행한다.
                System.out.println("우수 학생");
                break; // 아래 switch 탈출
            case 'B': // 만약에 B등급이면
                System.out.println("장려 학생");
                break;
            default:
                System.out.println("학생");
        }

        // (7) switch 중첩
        int adult=1;
        char gender2='w';
        switch (adult){
            case 1:
            System.out.println("성인");
            switch (gender2){
                case 'w':
                    System.out.println("성인여자");
                case 'm' :
                    System.out.println("성인남자");
            }
            break;
            default:
                System.out.println("미성년자");
                break;
        }

        // if = 조건에 따른 논리 검사 실행(범위 경우의수), switch=어떠한 값에 따른 흐름 제어(정해진 경우의수)

    }
}