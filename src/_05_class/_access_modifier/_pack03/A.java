package _05_class._access_modifier._pack03;
//필드와 메서드의 접근 제어자
public class A {
    public int field1;//public field
    int field2;//default field
    private int field3;//private field
    public A(){
        //클래스 내부에서는 접근 제어자 영향을 받지 않음!!
        field1=1;
        field2=2;
        field3=3;
        method1();
        method2();
        method3();
    }
    //public method
    public void method1(){}
    //default method
    void method2(){}
    //private method
    private void method3(){}
}
