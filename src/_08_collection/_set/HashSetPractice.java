package _08_collection._set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int input=0;
        while(input!=-1){
            System.out.printf("정수 입력: ");
            input=sc.nextInt();
            if(input!=-1){
            set1.add(String.valueOf(input));}


        }
        System.out.println("중복 제거된 정수 목록: "+set1);
    }
}
