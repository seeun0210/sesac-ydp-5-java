package _05_class._access_modifier._pack05;
//디자인 패턴 중 SingleTon 패턴
//:단 하나의 객체임을 보장한다
//-애플리케이션에서 단 하나의 객체를 만들고 싶다면, 싱글톤 패턴 쓰자!
//핵심개념
//-private 접근 제어자를 이용해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막음
//-new 연산자를 이용해 생성자를 호출할 수 없으니, 외부에서 객체 생성 불가능해짐
//-싱글톤 패턴이 제공하는 정적 메소드를 통해서 간접적으로 객체를 얻도록 함

public class Singleton {
    //private 접근 권한을 갖는 정적 필드 선언, 초기화
    private static Singleton singleton=new Singleton();
    //private 접근 권한을 갖는 생성자 선언
    private Singleton(){}
    //public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getInstance(){
        return singleton;
    }
}
