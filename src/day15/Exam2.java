package day15;

import day07.package1.A;

import java.util.*;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 컬렉션(수정) 프레임(틀) 워크(일)
        // 1. 정의: 자료들을 수정/저장하는 방법들을 미리 만들어 둔 인터페이스/클래스
        // 2. 목적: 복잡한 자료 구조를 제공받아 편리한 데이터 관리
            // 자료 구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조.. ex) 리스트/해시/큐/스텍/트리
        // 3. 종류: 인터페이스란? 서로 다른 클래스/타입들을 기능 통합
        /*
        인터페이스        구현체
        List            ArrayList, Vector, LinkedList, Stack 등
        Set             HashSet, TreeSet 등
        Map             HashMap, HashTable, TreeMap 등
         */

        // [2] List 타입
        ArrayList<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();

        // List 주요 메소드
        // (1) .add()
        list2.add("유재석");
        list2.add("유재석"); // 중복 허용
        list2.add(0, "강호동1"); // 특정 인덱스에 추가 가능
        System.out.println("list2 = " + list2); // list2 = [강호동1, 유재석, 유재석]

        // (2) .set()
        list2.set(0, "강호동2");
        System.out.println("list2 = " + list2); // list2 = [강호동2, 유재석, 유재석]

        // (3) .get()
        System.out.println("list2.get(1) = " + list2.get(1)); // list2.get(1) = 유재석

        // (4) .size()
        System.out.println("list2.size() = " + list2.size()); // list2.size() = 3

        // (5) .contains() .indexOf()
        boolean result1=list2.contains("강호동2");
        System.out.println("result1 = " + result1); // result1 = true
        int result2=list2.indexOf("강호동2");
        System.out.println("result2 = " + result2); // result2 = 0

        // (6) .remove()
        list2.remove("강호동2");
        System.out.println("list2 = " + list2); // list2 = [유재석, 유재석]
        
        // (7) .isEmpty()
        System.out.println("list2.isEmpty() = " + list2.isEmpty()); // list2.isEmpty() = false

        // (8) .clear()
        // list2.clear(); 전체 삭제

        // ======================================================================================
        // List 타입과 반복문
        // 1) 일반 for 문
        for(int index=0; index<=list2.size()-1; index++){
            System.out.println(list2.get(index));
        }
        // 2) 향상된 for 문
        for(String str:list2){
            System.out.println(list2);
        }
        // 3) forEach 문 *리스트 내 요소(값) 들을 하나씩 순서대로 반복변수에 대입하여 반복 실행
        // 변수명.forEach( (반복변수명)->{실행문;} );
        list2.forEach((str) ->{
            System.out.println(str);
        });

        // List 구현체들, 구현체란? 인터페이스의 추상메소드를 구현(오버라이딩)한 클래스/객체
        List<Integer> list; // 인터페이스 타입

        // 공통: 여러 요소(값)들을 순서대로(인덱스) 저장하는 <배열> 구조
        list=new ArrayList<>();  // 싱글 스레드 사용, 비동기화 메소드
        list.add(0,50);

        list=new Vector<>();     // 멀티 스레드 사용, 동기화(synchronized) 메소드

        list=new LinkedList<>(); // 싱글 스레드 사용, <링크> 구조
        list.add(0,100); // 0번 인덱스에 100 대입
        // ArrayList 중간 삽입/삭제 시 다른 데이터들의 이동 발생o
        //           삽입/삭제 느림, 뒤에 추가 빠름
        // VS
        // LinkedList 중간 삽입/삭제 시 다른 데이터들의 이동 발생x
        //            삽입/삭제 빠름, 뒤에 추가 비교적 느림

        Stack<String> stack =new Stack<>();      // Stack 스텍 자료 구조란? 입구랑 출구가 하나라서 선형 리스트 구조임, LIFO
        stack.push("유재석"); // 값 추가: push
        stack.push("강호동");
        System.out.println(stack.pop()); // 값 제거: pop
        System.out.println(stack.pop());
    }
}
