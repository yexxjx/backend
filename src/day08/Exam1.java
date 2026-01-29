package day08;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        // [1] Arraylist 클래스 : 컬랙션(수집) 프레임(틀) 워크(일), 수집 관련 클래스/기능 제공
        
        // [2] 정의 : 컬렉션프레임워크 중 리스트(배열) 자료형 클래스/타입
        
        // [3] 목적 : 가변(변하는요소들의수) 길이의 배열 제공과 기능/메소드 제공
        
        // [4] 사용법
            // 1. 선언/정의하기 : ArrayList<항목타입> 변수명=new ArrayList()<>;
            // > <>괄호는 제네릭 타입으로 리스트 안에 저장할 항목들의 타입
            // > 제네릭타입은 기본타입이 불가능하므로 int>Integer 클래스로 변경해서 작성 (8개 타입)
        ArrayList<String> 리스트변수명=new ArrayList<>(); // 여러개 String 객체를 저장하는 리스트
        // vs String [] 변수명=new String[100];
            // 2. 요소 추가 : .add(새로운값); 마지막 빈 요소에 요소 추가
        리스트변수명.add("유재석");
        리스트변수명.add("신동엽");
        리스트변수명.add("강호동");
            // 3. 요소 출력
        System.out.println(리스트변수명);
            // 4. 요소 중간 삽입
        리스트변수명.add(1, "서장훈");
        System.out.println("리스트변수명 = " + 리스트변수명);
            // 5. 요소 수정 : .set(인덱스, 새로운 값)
        리스트변수명.set(1, "박명수");
        System.out.println("리스트변수명 = " + 리스트변수명);
            // 6. 요소 총개수 .size() : 리스트 내 항목/요소/값 들의 총개수 반환 vs length[배열]
        System.out.println(리스트변수명.size());
            // 7. 요소 갑 호출 .get(인덱스) : 특정한 인덱스의 요소값 반환 vs 배열명[인덱스]
        System.out.println(리스트변수명.get(0));
        System.out.println(리스트변수명.get(2));
            // 8. 요소 삭제 : .remove(인덱스) : 특정한 인덱스의 요소 삭제
        리스트변수명.remove(1);
        System.out.println("리스트변수명 = " + 리스트변수명);
            // 9. 요소 찾기 : .indexOf(찾을 값) : 찾을 값이 존재하면 인덱스 반환, 없으면 -1
        int 찾은결과=리스트변수명.indexOf("강호동");
        System.out.println("찾은결과 = " + 찾은결과);
            // 10. 요소 찾기 2 : .contains(찾을 값) : 찾을 값이 존재하면 true, 없으면 false 반환
        boolean 찾은결과2=리스트변수명.contains("강호동");
        System.out.println("찾은결과2 = " + 찾은결과2);
        
        // [5] 반복문과 리스트 활용
            // 1. 일반 for문
        for(int index=0;index<=리스트변수명.size()-1;index++){
            System.out.println("리스트변수명.get(index) = " + 리스트변수명.get(index));;
        }
            // 2. 향상된 for문
        for(String str : 리스트변수명){
            System.out.println("str = " + str);
        }
        
            // 11. 요소 전체 삭제 : .clear()
        리스트변수명.clear();
            // 12. 요소 존재 여부 : .isEmpty() : 리스트 내 요소가 하나도 없으면 true 있으면 false
        boolean 여부=리스트변수명.isEmpty();
        System.out.println("여부 = " + 여부);
        System.out.println("리스트변수명 = " + 리스트변수명);
        
    }
}
