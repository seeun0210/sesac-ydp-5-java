package _05_class._abstractEx;

public class Circle extends Shape {
    double radius;

    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }

    @Override
    double calculateArea(double width, double height) {
        return 0; // This may not be applicable for a circle, so returning 0 for now
    }

    @Override
    void ShapeInfo() {
        super.ShapeInfo();
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 넓이: " + calculateArea(radius));
    }
}
