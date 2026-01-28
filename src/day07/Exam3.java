package day07;

public class Exam3 {
    public static void main(String[] args) {
        // [1] 멤버 변수가 private이면 다른 클래스 접근 불가능
        User user=new User();
        // user.name="유재석"; 작동x
        // System.out.println("user.name = " + user.name); 작동x

        // setter 이용한 멤버 변수 접근(저장)
        user.setName("유재석");

        // getter 이용한 멤버 변수 접근(호출)
        System.out.println(user.getName());

        // [2] toString
        // day07.User@119d7047 > toString 오버라이드 > .User(name="유재석", age=0)
        System.out.println(user);

    }
}
class User{
    // 1. 멤버변수
    private String name;
    private int age;

    // 2. 생성자

    // 3. 메소드
    // * 관례적으로 private 멤버 변수에 대해 간접 접근 메소드
    // getter 메소드 : 호출용
    public String getName(){
        return this.name;
    }

    // setter 메소드 : 저장용
    public void setName(String name){
        this.name=name;
    }

    // 자동 : 클래스 내 마우스 오른쪽 클릭 > 생성 > 생성자/getter/setter 만들 수 있음
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // * toString() 메소드
    // 모든 클래스가 자동을 갖고 있는 메소드 중 하나
    // 객체의 주소(위치)값 출력
    // 자동 : 클래스 내 마우스 오른쪽 클릭 > 생성 > toString

//    @Override // 오버라이드 : 기존 메소드를 커스텀/재정의
//    public String toString() {
//        // 객체의 주소값 대신에 출력하고 싶은 것
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//                }
}

