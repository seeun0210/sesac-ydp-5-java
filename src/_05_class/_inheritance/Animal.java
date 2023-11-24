package _05_class._inheritance;

public class Animal {
    public Animal(String kind) {
        this.kind = kind;
    }




    String kind;
    private String name;
    private int Age;
    //부모 클래스의 메소드
    void makeSound(){
        System.out.println("동물이 소리를 낸다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
