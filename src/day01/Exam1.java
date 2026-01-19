
    // 한 줄 주석
    /* 여러 줄 주석 */

    package day01; // 패키지(폴더)이면서 클래스 위치 식별

    public class Exam1 {
    // public : 공개용
    // class : 자바는 코드의 최소 실행 단위, 즉) 자바는 클래스 필수이다.
    // exam1 : 클래스명은 무조건 첫글자를 대문자
    // { : 클래스 내부 시작
    // } : 클래스 내부 종료.. 즉) 클래스 {} 밖에서 작성한 코드 실행 안 됨
        // [1] 클래스 내부에서는 선언만 가능
        int a=10; // ; 필수
        // [2] 함수 실행은 main(미리만들어진) 함수 안에서만 가능
        // System.out.print("안녕"); // 출력함수 안 됨
        public static void main(String[] args){
            System.out.println("자바안녕"); // sout+엔터; 자동완성
        }
    }

    // int b=10; // 클래스 밖에서 코드 작성 안 됨
