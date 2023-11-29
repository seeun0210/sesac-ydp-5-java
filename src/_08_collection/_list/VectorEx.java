package _08_collection._list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> vec = new Vector<>();

        // 각 쓰레드마다 1만번을 돌아 컬렉션에 요소를 추가한다. (두개 쓰레드니까 총 컬렉션에 요소가 2만개 추가된다)
        new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                list.add(1);
                vec.add(1);
            }
        }).start();

        new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                list.add(1);
                vec.add(1);
            }
        }).start();

        // 출력
        new Thread(() -> {
            try {
                Thread.sleep(2000);  // 쓰레드가 다 돌때까지 2초 대기

                System.out.println("ArrayList의 추가된 요소 갯수 size : " + list.size());
                System.out.println("Vector의 추가된 요소 갯수 size : " + vec.size());
            } catch (InterruptedException ignored) {}
        }).start();
    }

}
