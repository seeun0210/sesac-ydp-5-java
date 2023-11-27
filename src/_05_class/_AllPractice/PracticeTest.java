package _05_class._AllPractice;

public class PracticeTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.setName("mycar");
        System.out.println(car.getName());
        car.setMaxSpeed(200);
        System.out.println(car.getMaxSpeed());
        car.move();
        Airplane airplane;
        airplane=new Airplane(10000);
        airplane.fly();
    }
}
