package day09;

public class Exam4 {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.tire=new Tire();
        myCar.run();

        // 타이어 교체
        myCar.tire=new HankkookTire();
        myCar.run();

        // 타이어 교체
        myCar.tire=new KumhoTire();
        myCar.run();

        System.out.println(myCar.tire instanceof Tire);
        System.out.println(myCar.tire instanceof KumhoTire);
        System.out.println(myCar.tire instanceof HankkookTire);
    }
}

class Car{
    Tire tire;
    void run(){this.tire.roll();}
}

class Tire{
    void roll(){
        System.out.println("[일반] 타이어가 회전");
    }
}

class HankkookTire extends Tire{ // 일반 타이어로부터 상속받아 한국타이어에서 메소드 재정의
    void roll(){
        System.out.println("[한국] 타이어가 회전(업그레이드)");
    }
}

class KumhoTire extends Tire{ // 일반 타이어로부터 상속받아 금호타이어에서 메소드 재정의
    void roll(){
        System.out.println("[금호] 타이어가 회전(업그레이드)");
    }
}
