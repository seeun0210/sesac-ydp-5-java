package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력해 주세요. (exit 입력 시 종료):");

        while (true) {
            String input = sc.next();

            if (input.equals("exit")) {
                break;
            }

            strings.add(input);
        }

        sc.close();


        System.out.println("입력한 문자열들:");

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
