package _05_class._inheritance;


public class Bus extends Vehicle {

    public Bus(String brand, String model, int year) {
        super(brand, model, year);
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai", "City Bus", 2022);
        // You can now use the methods from the Vehicle class on the Bus object
        bus.start();
        System.out.println("승객을 운송합니다.");
        bus.stop();
    }
}
