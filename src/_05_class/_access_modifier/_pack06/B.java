package _05_class._access_modifier._pack06;

public class B {
    public void method(){
        //default와 같이 같은 클래스 안에서는 제약 없음!
        A a=new A();
        a.field1=11;
        a.method1();
    }
}
