package _05_class._AllPractice;

public class Airplane implements Flyable {
 int height;

    public Airplane(int height) {
        this.height = height;
    }

    @Override
    public void fly() {
        System.out.println("고도"+this.height+"피트에서 하늘을 날아가는 중");
    }
}
