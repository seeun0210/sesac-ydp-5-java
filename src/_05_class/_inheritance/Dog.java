package _05_class._inheritance;

public class Dog extends Animal{
    public Dog(String kind, String name,int age) {
        super(kind);
        this.setName(name);
        this.setAge(age);
    }
    //메소드 오버라이딩: 부모클래스의 makeSound() 메소드 재정의
//    @Override
//    void makeSound(){
//        System.out.println("멍멍!");
//    }

    @Override
    void makeSound() {
        System.out.println("멍멍!");
        super.makeSound();//부모클래스의 메소드 호출
    }

    void fetch(){
        System.out.println("공 가져와!");
    }

}
