package _04_exception;
import java.util.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ExceptionPractice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        try{
            for(int i=0;i<5;i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("배열의 크기를 입력하세요:");
            int size = sc.nextInt();

            System.out.println("양수를 입력하세요. 음수를 입력하면 종료됩니다.");

            while (true) {
                try {
                    int input = sc.nextInt();

                    if (input < 0) {
                        break;
                    }

                    numbers.add(input);
                    if(numbers.size()>=size){
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("올바른 정수를 입력하세요.");
                    sc.nextLine();
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println("입력이 끝났습니다.");
        } finally {


            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }

            System.out.println("입력한 숫자들의 평균 " + (double) sum/numbers.size());
            numbers.clear();
        }


        Scanner sc2 = new Scanner(System.in);

        try {
            System.out.println("배열의 크기를 입력하세요:");
            int size = sc2.nextInt();

            System.out.println("양수를 입력하세요. 음수를 입력하면 종료됩니다.");

            while (true) {
                try {
                    int input = sc2.nextInt();

                    if (input < 0) {
                        break;
                    }

                    numbers.add(input);

                    if (numbers.size() >= size) {
                        System.out.println("입력이 완료되었습니다.");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("올바른 정수를 입력하세요.");
                    sc2.nextLine();
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println("입력이 끝났습니다.");
        } finally {
            sc.close();
            sc2.close();
            // numbers 배열을 정렬
            Collections.sort(numbers);


            System.out.println(numbers);
            List<List<Integer>> groupedNumbers = new ArrayList<>();
            List<Integer> currentGroup = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                if (i > 0 && !numbers.get(i).equals(numbers.get(i - 1))) {
                    // 현재 값이 이전 값과 다르면 새로운 그룹 시작
                    if (currentGroup.size() >= 2) {
                        groupedNumbers.add(new ArrayList<>(currentGroup));
                    }
                    currentGroup.clear();
                }
                currentGroup.add(numbers.get(i));
            }
            if (currentGroup.size() >= 2) {
                groupedNumbers.add(new ArrayList<>(currentGroup));
            }

            // 그룹화된 값들 출력
            System.out.println("그룹화된 값들: " + groupedNumbers);
        }
    }
}
