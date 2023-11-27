package _05_class._abstractEx;

public abstract class Shape {
    String color;
    String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    abstract double calculateArea();

    // Include the necessary parameters for each shape
    abstract double calculateArea(double radius);

    abstract double calculateArea(double width, double height);

    void ShapeInfo() {
        System.out.println("===" + this.type + "도형의 정보===");
    }
}
