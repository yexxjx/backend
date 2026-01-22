package day04;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 1~5 출력
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        // vs 초기값: 1, 조건문: 5까지, 증감식: 1씩 증가
        for(int 출력값 = 1; 출력값 <= 5; 출력값++) {
            System.out.println(출력값);
        }

        // [2] 구구단
        // (1) 2단~9단: 초기값:1, 조건문:9까지, 증감식: 1씩 증가
        for(int 단 = 2; 단 <= 9; 단++){
            System.out.println(단);}
        // (2) 1곱~9곱: 초기값:1, 조건문: 9까지, 증감식: 1씩 증가
        for(int 곱 = 1; 곱 <= 9; 곱++){
            System.out.println(곱);}
        // (3) 단 반복문이 1회 반복할 때마다 곱의 반복문은 9번 실행
        for(int 단 = 2; 단 <= 9; 단++){
            for(int 곱 = 1; 곱 <= 9; 곱++){
            System.out.printf("%d*%d=%d \n", 단, 곱, 단*곱);}
        // 실행횟수: 8*9
            }

        // [3] break; 가장 가까운 반복문/switch{} 탈출/ continue 가장 가까운 반복문(증감식) 이동
        for(int i=1;i<=5;i++){
            if(i==3){break;} // 코드 흐름이 break 만나면 반복문 탈출
            System.out.println(i);
        }
        for(int i=1; i<=5; i++){
            if(1==3){continue;} // 코드 흐름이 continue 만나면 증감식(i++) 이동
            System.out.println(i);
        }

        // [4] 무한루프: 조건문이 true 상수로 계속 되는 반복문
//        for( true ){ // 조건식에 true 상수 넣으면 무한루프
//            System.out.println("무한루프");
//            Scanner scan=new Scanner(System.in);
//            String data=scan.next();
//            if(data.equals("q")){break;}
//        }
    }
}