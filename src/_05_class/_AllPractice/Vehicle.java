package _05_class._AllPractice;

public class Vehicle {
    String name;
    int MaxSpeed=200;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }
    public void move(){
        System.out.println("도로를 따라 이동중");
    }
}
