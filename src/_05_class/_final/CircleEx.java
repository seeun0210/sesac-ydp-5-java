package _05_class._final;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요:");

        circle.setR(sc.nextInt());
        int r=circle.getR();
        System.out.printf("원의 반지름: %f\n",(double)r);
        circle.CircleArea(r);

    }
}
