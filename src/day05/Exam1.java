package day05;

import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 배열이란? *동일한 타입*의 여러 자료들을 순서대로 저장하는 자료 타입
        // [2] 선언 : 타입[] 변수명=new 타입[총 개수];
        // [3] 특징: (1) 동일한 타입끼리 (2) 고정길이 (3) 요소 초기값 존재
        // [4] 인덱스란? 배열 내 요소(값)들이 저장된 순서 번호, 0번 시작
        int[ ] ary1=new int[3]; // {0, 0, 0}
        String[] ary2={"봄","여름","가을","겨울"}; // {초기값1, 초기값2, 초기값3, 초기값4}
        // [5] 배열 변수의 출력
        System.out.println(ary1); //[I@4c873330 : 배열의 주소(메모리위치) 값 출력 *주소값은 개발자가 제어 불가능
        System.out.println(ary2);
        // [6] 배열 변수의 요소/값 전체 출력, Arrays.toString(배열변수열)
        System.out.println(Arrays.toString(ary1)); // [0, 0, 0]
        System.out.println(Arrays.toString(ary2)); // [봄, 여름, 가을, 겨울]
        // [*] 배열의 메모리 주소 상태 간단 구조
        /*
         1. new int[3] 선언하면 int[4바이트], int[4바이트], int[4바이트]
         2. 총 4바이트*3= 12바이트 생성
         3. 컴퓨터는 최소의 (윈도우)저장단위를 바이트(위치/주소 값)
         > 12개의 주소 값 생성, 101번지 102번지 103번지 104번지, 201번지 202번지 203번지 204번지, 301번지 302번지 303번지 304번지
         4. 배열의 변수는 총 12개의 주소값을 가지는 게 아니다. 가장 첫번째 주소값을 가진다.
         int ary1=new int[3];
         ary1= 101번지 : 첫번째 요소의 주소값이 들어있음
         5. 실행 중에 개발자가 배열 내 주소값을 삭제할 수 없다. vs JS는 delete 대신 splice
         6. 주소값에 초기값이 생략되면 임의의 초기값을 자동으로 들어간다. <Garbage Collector : 비어있는 메모리 삭제>
         정수:0, 실수:0.0, 문자열/객체:NULL, 논리:false // 0 vs null vs 초기값 없음
        */

        // [7] 배열 사용
        System.out.println(ary1.length); // 배열변수명.length : 배열의 총 길이=3
        // [8] 배열 내 요소 값 수정, 주소갑이 변경 되는 건 아니다
        ary1[0]=10; // 배열변수명.[인덱스]=새로운값;
        System.out.println(ary1); // 배열변수명[인덱스]
        ary2[1]="spring";
        System.out.println(ary2[1]);
        // [9] 배열의 요소 추가
        // ary1[4]=40; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        // [10] 반복문 활용
        for(int index=0;index<=ary1.length-1;index++){ // index는 0부터 마지막 인덱스 이하까지 1씩 증가한다.
            System.out.println(ary1[index]); // [index]번째 요소값 가져오기/출력
        }
        // [11] 향상된 for문 : 위와 같이 많이 사용되므로 추가된 반복문
        // for(타입 반복변수 : 배열변수명){}, iterator(이터레이터/반복자/순회자)가 가능한 배열/객체만 사용 가능
        for(int value:ary1){
            System.out.println(value);
        }
    }
}
