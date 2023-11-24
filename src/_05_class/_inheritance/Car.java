package _05_class._inheritance;

public class Car extends Vehicle{
    public Car (String brand, String model, int year) {
        super(brand, model, year);
    }

    public static void main(String[] args) {
        Car car = new Car("Hyundai", "City Bus", 2022);
        // You can now use the methods from the Vehicle class on the Bus object
        car.start();
        System.out.println("주차했습니다.");
        car.stop();
    }
}
