package _05_class._abstractEx;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, String type, double width, double height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculateArea(double radius) {
        return 0; // This may not be applicable for a rectangle, so returning 0 for now
    }

    @Override
    double calculateArea(double width, double height) {
        return width * height;
    }

    @Override
    void ShapeInfo() {
        super.ShapeInfo();
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 넓이: " + calculateArea(width, height));
    }
}
