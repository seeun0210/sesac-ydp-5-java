package _05_class._access_modifier._pack04;

import _05_class._access_modifier._pack03.A;

public class C {
    public void method(){
        A a=new A();//A클래스와 C클래스는 패키지가 다르므로 import 호출
        a.field1=11;
//        a.field2=22;//default field이므로 불가능
//        a.field3=33;//private field이므로 불가능
        //메소드 호출
        a.method1();
//        a.method2();
//        a.method3();
    }
}
