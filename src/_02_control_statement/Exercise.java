package _02_control_statement;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age >= 1 && age <= 7) {
            System.out.println("유아");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 9 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else if (age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("나이 다시 확인");
        }

        // 첫 번째 Scanner 객체 닫기


        Scanner sc2 = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = sc2.next();

        if (name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요.");
        }

        // 두 번째 Scanner 객체 닫기


        Scanner sc3 = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num = sc3.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }

        // 세 번째 Scanner 객체 닫기
        sc.close();
        sc2.close();
        sc3.close();
    }
}
