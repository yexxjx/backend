package day09;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 모든 클래스는 object 클래스로부터 상속받음
        System.out.println("====[1]====");
        A a=new A(); // 총 객체 : 2개, A<Object (슈퍼클래스)

        // [2] 상속 관계에서는 객체 생성시 부모 객체 먼저 생성
        System.out.println("====[2]====");
        B b=new B(); // 총 객체 : 3개, B<A<Object

        // [3] 타입 변환 시 업/다운 캐스팅만 가능
        System.out.println("====[3]=====");
        C c=new C(); // 총 객체 : 3개, C<A<Object

        // [4]
        System.out.println("====[4]=====");
        D d=new D(); // 총 객체 : 4개, D<B<A<Object
        E e=new E(); // 총 객체 : 4개, E<C<A<Object
        // 즉) 자바는 상속(물려주는)관계를 메모리(저장소)로 표현

        // [5] 자동 타입 변환
        A a2=b;
        Object o1=a2; // b>a>Object
        // B b2=c; c 객체가 생성될 때는 b는 생성되지 않음

        // [6] 강제 타입 변환
        B b2=(B)a2; // a2의 태생은 b객체 이므로 가능하다
        // C c1=(C)a2; 오류 발생, a2의 태생은 b객체 이므로 b가 태어날 때 c는 태어나지 않음

        // [7] 타입 확인, 객체 instance of 클래스/타입명

        System.out.println(a instanceof Object); // true
         // a 객체가 생성될 때 Object가 생성 되었는 지 확인

        // System.out.println(b instanceof c); false
         // b 객체가 생성될 때 c가 생성 되었는 지 확인

        System.out.println(e instanceof A); // true
         // e 객체가 생성될 때 A가 생성 되었는 지 확인

        // ystem.out.println(b instanceof D); false
         // b 객체가 생성될 때 d가 생성 되었는 지 확인

        // 즉) 해당 객체가 생성될 때 부모 객체는 생성되지만 자식 객체는 생성 안 됨
        // 다운 캐스팅이 안 되는 전제 조건

    }
}

class A{
    A(){
        System.out.println("A 객체 생성");
    }
}

class B extends A{
    B(){
        System.out.println("B 객체 생성");
    }
}

class C extends A{
    C(){
        System.out.println("C 객체 생성");
    }
}

class D extends B{
    D(){
        System.out.println("D 객체 생성");
    }
}


class E extends C{
    E(){
        System.out.println("E 객체 생성");
    }
}