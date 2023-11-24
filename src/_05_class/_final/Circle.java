package _05_class._final;

public class Circle {
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    private int r;
    private static final double PI=3.141592;
    public void CircleArea(int r){
        System.out.printf("원의 넓이는: %f",getR()*getR()*PI);
    }
}
