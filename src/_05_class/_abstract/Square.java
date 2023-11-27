package _05_class._abstract;
//구체적인 클래스-도형(사각형)
public class Square extends Shape {
    public Square(String color){
        super(color);//부모 생성자 호출
    }

    @Override
    void draw() {
        System.out.println("사각형을 그리는 중입니다...");
    }
}
