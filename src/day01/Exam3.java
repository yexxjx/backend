package day01; // 클래스 파일이 속한 패키지명

public class Exam3 { // class start

    // m+엔터 : 코드의 흐름을 읽어주는 main함수 선언
    public static void main(String[] args) { // m start

        // [1] System.out.printIn() : 자료 출력 후 줄 바꿈 포함, sout 자동완성
        // System : 클래스이면서 시스템(한컴퓨터) 관련 기능/함수 제공
        // out : 출력에 관련된 기능/함수 갖는 객체 반환
        // print : 출력함수
        System.out.println("자바안녕1"); // vs console.log()

        // [2] System.out.print() : 자료 출력
        System.out.print("자바안녕2");

        // [3] System.out.printf() : 자료 출력+형식문자
        System.out.printf("%s", "자바안녕3");
        /*
            printf(format 형식)
            %s : 문자열, %d : 정수, %c : 문자, %f : 실수
            자릿수
                %자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 공백, 오른쪽 정렬
                %-자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 공백, 왼쪽 정렬
                %0자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 0으로 채움
                %전체자릿수. 소수점자릿수f
        */

        String name="유재석"; int age=10;
        // 문자열과 변수를 연결할 때 +더하기(연결 연산자)로 연결
        System.out.printf("저는"+name+"이고 나이는 "+age+"입니다.");
        // 변수 또는 수식이 들어가는 자리에 형식 문자로 대체한다.
        System.out.printf("저는 %s이고 나이는 %d입니다.\n", name, age);
        System.out.printf("저는 %s이고 나이는 %6d입니다. \n", name, age);
        System.out.printf("저는 %s이고 나이는 %-6d입니다. \n", name, age);
        System.out.printf("저는 %s이고 나이는 %06d입니다. \n", name, age);
        System.out.printf("저는 %s이고 키는 %3.2f입니다. \n", name, 177.2354);


        // [4] 이스케이프/제어 문자
        // \n 줄바뀜, \t 들여쓰기, \" 큰따옴표출력, \' 작은따옴표출력, \\ 백슬래쉬 출력
        System.out.println("안녕1\n안녕2");
        System.out.println("안녕1\t안녕2");
        System.out.println("안녕1\"안녕2");
        System.out.println("안녕1\'안녕2");
        System.out.println("안녕1\\안녕2");



    } // m end
} // class end
