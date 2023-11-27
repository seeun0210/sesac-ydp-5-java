package _05_class._abstract;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle=new Circle("blue");
        Square square= new Square("yellow");
        circle.start();
        circle.draw();//추상 메소드의 구현
        System.out.println("원의 색상은"+circle.getColor());

        square.start();
        square.draw();//추상 메소드의 구현
        System.out.println("사각형의 색상은"+square.getColor());
    }
}
