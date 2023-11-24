package _05_class._inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand,String model,int year) {
        this.brand = brand;
        this.model=model;
        this.year=year;
    }

    public void start(){
        System.out.println("차량이 시동을 걸었습니다.");
    }
    public void stop(){
        System.out.println("차량이 정지를 했습니다.");
    }
}
