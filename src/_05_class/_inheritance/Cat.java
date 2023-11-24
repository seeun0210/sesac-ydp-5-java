package _05_class._inheritance;

public class Cat extends Animal {

    public Cat(String kind, String name,int age) {
        super(kind);
        this.setName(name);
        this.setAge(age);
    }

    @Override
    void makeSound() {
        System.out.println("냐옹!");
        super.makeSound();
    }
}
