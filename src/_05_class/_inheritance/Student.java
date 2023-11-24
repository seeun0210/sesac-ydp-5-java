package _05_class._inheritance;

public class Student extends Person{

    //Case1. public 필드를 선언
//    public String campus;
//    public Student(String name, int age){
//        // super() 는 자식클래스 생성자의 첫줄에 작성해야 함
//        //부모클래스가 기본 생성자
////        super();//생략가능 (컴파일시 자동 추가)-> "부모클래스의 생성자를 호출"
//        //부모클래스가 매개변수를 갖는 생성자를 갖는 경우
//        super(name,age);
//        System.out.println("자식 클래스의 Student(String name, int age)상속됨");
////        this.name=name;
////        this.age=age;
//    }
    public String getCampus() {
        return campus;
    }
    private String campus;
    public Student (String name, int age){
        setName(name);
        setAge(age);
    }
    public void setCampus(String campus){
        this.campus=campus;
        System.out.printf("%s 캠퍼스에서 공부중!!",campus);
    }



}
