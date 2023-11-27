package _05_class._abstract;
//추상 클래스
public abstract class Shape {
    //필드 선언
    String color;
    public Shape(String color){
        this.color=color;

    }
    //추상 메소드 선언
    //-abstract 키워드 사용
    //-선언만 하고, 구현은 하지 않은 메소드
    //-중괄호 없음
    //-메소드 구현은 자식 클래스마다 다른 경우에 추상 메소드 사용!
    abstract void draw();
    //추상 클래스는 일반 메소드
    //도 가질 수 있음
    void start(){
        System.out.println("도형을 그려보자!!");
    }
    public String getColor(){
        return color;
    }
}
