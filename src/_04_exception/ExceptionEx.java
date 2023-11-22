package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static String divide(int x,int y){
        return x+"/"+y+"="+(x/y);
    }
    public static int getLength(String str){
        return str.length();
    }
    public static int getValueByIdx(int[] arr, int idx){
        return arr[idx];
    }
    public static void main(String[] args) {
        //case1.예외 발생 코드
        System.out.println(divide(6,2));
//        System.out.println(divide(6,0));//Error
        //case2.예외 처리 코드
        try{
            System.out.println("연산을 시작합니다!");
            System.out.println(divide(6,0));
        }catch(ArithmeticException e){
            System.out.println("나누기 중 에러가 발생함 >>"+e.getMessage());//방법1. 예외가 발생한 이유를 보여줌
//            System.out.println("나누기 중 에러가 발생함 >>"+e.toString());//방법2. 예외 종류 리턴
//            e.printStackTrace();//방법2. 예외가 어디서 발생했는지  추적한 내용을 출력
        }finally {
            System.out.println("연산이 종료되었습니다!!\n\n");
        }
        int[] numbers={10,20,30,40,50};
        System.out.println(getValueByIdx(numbers,1));
       try{
           System.out.println(getValueByIdx(numbers,numbers.length));
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("배열 인덱싱 중 에러 발생>>"+e.toString());
       }
       //case4
        Scanner sc=new Scanner(System.in);
       try{
           System.out.println("정수를 입력하세요");
           int number=sc.nextInt();
           System.out.println("입력한 정수: "+number);
       }catch(InputMismatchException e){
           System.out.println("에러 발생>>"+e.toString());
       }



    }
}
