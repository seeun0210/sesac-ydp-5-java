package _05_class._abstractEx;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c= new Circle("Red", "Circle",10);
        Rectangle rec=new Rectangle("Blue","Rectangle",4,6);

        c.ShapeInfo();
        rec.ShapeInfo();

    }
}
