package _01_basic_syntax;

import java.util.Scanner;

//입출력
public class inputOutput {
    public static void main(String[] args) {
//        출력
        System.out.print("안녕하세요, \n");
        System.out.println("저는 김새싹 입니다! ");
        System.out.println(("잘 부탁드립니다. "));

//        입력
        System.out.println("공백으로 구분해서 이름, 나이 ,키, 결혼여부를 입력해주세요 :");
        Scanner sc=new Scanner(System.in);

        String name=sc.next();// 공백 이전까지의 문자열을 읽음
        int age=sc.nextInt();//공백 이전까진의 정수 읽기
        double height=sc.nextDouble();//공백 이전까지의 실수 읽기
        boolean single=sc.nextBoolean();//공백 이전 까지의 불리언 읽기

        System.out.println("=====입력 결과 출력=======");
        System.out.println("이름:"+name);
        System.out.println("나이:"+age);
        System.out.println("키:"+height);
        System.out.println("결혼여부:"+single);

        sc.close();//스캐너 닫기
    }
}
