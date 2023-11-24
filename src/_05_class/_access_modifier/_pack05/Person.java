package _05_class._access_modifier._pack05;

public class Person {
    private int age;
    private String name;
    //constructor
    public Person(String name) {
        this.name = name;
    }
    //name getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = 0;
        }else{
            this.age=age;
        }
    }
}
