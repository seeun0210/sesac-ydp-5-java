package _05_class;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        ArrayList<Rectangle>rectangles=new ArrayList<>();



        Scanner sc=new Scanner(System.in);
        int width=1;
        int height=1;
        while(!(width==0)&&!(height==0)){
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            width=sc.nextInt();
            height=sc.nextInt();
            Rectangle rec=new Rectangle(0);
            rec.setWidth(width);

            rec.setHeight(height);
            rectangles.add(rec);
        }
        for(int i=0;i<=rectangles.size()-1;i++){
            Rectangle rec = rectangles.get(i);
            System.out.printf("가로길이는: %d\n", rec.getWidth());
            System.out.printf("세로길이는: %d\n", rec.getHeight());
            System.out.printf("넓이는: %d\n", rec.area(rec.getWidth(), rec.getHeight()));
            System.out.println("------------------");
        }



    }
}
