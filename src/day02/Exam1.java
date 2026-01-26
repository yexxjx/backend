package day02;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 타입=자료형=분류=자료를 분류/나누는 방법, *다형성 특징*(다양한 형/모형 가짐)
        // (1) 자동 타입 변환/캐스팅(묵시적:개발자가 따로 할 게 없다, 손실 없다)
        // byte>short>int>long>float>double (작은 상자>큰 상자)
        byte byteValue=10; // 10 자료를 byte 타입으로 분류
        short shortValue=byteValue; // byte 타입>short 타입 변환
        int intValue=shortValue; // short 타입>int 타입 변환
        long longValue=intValue; // int 타입>long 타입 변환
        float floatValue=longValue; // long 타입>float 타입 변환
        double doubleValue=floatValue; // float 타입>double 타입 변환



        // (2) 연산 중 (자동) 타입변환
        // byte+byte=int, byte+short=int, int+int=int, int이하 피연산자들은 연산하면 int로 결과
        // long/float/double 는 피연산자 중에 더 큰 타입으로 결과
        byte b1=10; byte b2=20; short s1=30; int i1=40; long l1=50L; float f1=3.14F; double d1=41.25;
        int result1=b1+b2; // byte+byte=int
        int result2=b1+s1; // byte+short=int
        int result3=i1+i1; // int+int=int
        long result4=i1+l1; // int+long=long
        float result5=i1+f1; // int+float=float
        double result6=i1+d1; // int+double=double

        // (3) 강제 타입 변환/캐스팅 (암시적 : 개발자가 변화할 타입 작성), 손실 있다
        // double>float>long>int>short>byte (큰 상자>작은 상자)
        double dvalue=3.14;
        float fvalue=(float)dvalue; // (새로운타입)기존값
        long lvalue=(long)fvalue;
        int ivalue=(int)lvalue;
        short svalue=(short)ivalue;
        byte bvalue=(byte)svalue; // dvalue에는 3 자료가 들어있다. 손실 발생
    }
}
