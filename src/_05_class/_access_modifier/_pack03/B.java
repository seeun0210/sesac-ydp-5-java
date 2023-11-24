package _05_class._access_modifier._pack03;

public class B {
    public void method(){
        A a=new A();//A와 B는 같은 패키지
        //필드 변경
        a.field1=11;//가능
        a.field2=22;//가능
//        a.field3=33;//field3은 private 접근제한자이기 때문에 같은 클래스 내에서만 접근이 가능함.

        //메소드 호출
        a.method1();//public
        a.method2();//default
//        a.method3();//private method이므로 같은 클래스에서만 접근 가능
    }
}
