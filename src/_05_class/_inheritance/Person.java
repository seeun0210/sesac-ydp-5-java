package _05_class._inheritance;
//상속
//-JAVA는 다중 상속 미지원= extends 키워드 뒤에는 부모클래스 하나만 올 수 있음
//-부모 클래스 = 슈퍼 클래스
//-자식 클래스 = 서브 클래스
public class Person {
//public String name;
//public int age;
//
//
////기본 생성자(매개변수 없음)
////    public Person(){
////        System.out.println("부모 클래스의 Person() 생성자가 실행됨");
////    }
//    //-부모 클래스가 "매개변수를 갖는 생성자"를 갖는경우
//    public Person(String name, int age){
//        this.name=name;
//        this.age=age;
//        System.out.println("부모 클래스의 Person(String name, int age) 생성자가 실행됨");
//    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //일반 메소드
    public void say(){
        System.out.println("안녕!");
    }
    public void eat(String food){
        System.out.printf("%s 를(을) 먹고 있음!!",food);
    }

}
