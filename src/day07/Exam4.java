package day07;

public class Exam4 {
    void 멤버메소드(){} // 1) 멤버함수
    static void 정적메소드(){} // 2) 정적메소드
    public static void main(String[] args) {

        // [1] final, 고정
        // 사용법 : final 타입 변수명=초기값;
        // > final 변수는 초기값이 무조건 필수임 <수정 못하니까>

        // 클래스명.정적(static)변수 : 객체 필요없음
        System.out.println(D.name);
        System.out.println(D.point);
        // 객체변수명.고정(final)변수 : 객체 필요함
        D d=new D();
        System.out.println(d.PI);

        //
        // D.method1(); // static이 아니라서 error
        d.method1(); // static 없으면 객체로 부르면 됨
        D.method2(); // static이라서 가능

        // [2] static, 정적인
        // 사용법 : static 타입 변수명;, static void 메소드명(){}
        // > static 변수/메소드는 프로그램 실행시 우선(메모리)할당 되고 프로그램 종료시까지 유지
        // > 메모리 할당된 변수/메모리 이므로 객체가 필요없음 <과도한 사용은 좋지 않음>
        // > 프로그램 내 공유 변수, 공유 메소드에 대해서 사용, 즉) 프로그램 내 1개만 존재해야 하는 변수/메소드
        // > static 갖는 메소드는 실행문에서 일반메소드 호출이 불가능하다 <객체 필요>

        // 멤버메소드(); // error // static 갖는 변수/메소드는 우선 할당이므로 객체가 아닌 멤버 메소드를 모른다.
        Exam4 exam4=new Exam4(); // 객체 만들어서 멤버메소드 호출
        exam4.멤버메소드();
        정적메소드(); // main 메소드가 static 갖고 정적메소드도 static 갖기 때문에 서로 알고 있는 상태 <객체 필요없음>
    }
}

class D{
    // final 키워드는 초기값이 필수
    // final int 최종변수;
    final double PI=3.14159;
    // static 키워드는 공유변수
    static int point;
    // 상수, public static final
    public static final char name='A';
    // final 메소드 : 오버라이딩/재정의 금지
    public final void method1(){}
    // static 메소드 : 객체 유무 없이 호출 가능한 메소드
    public static void method2(){}

}