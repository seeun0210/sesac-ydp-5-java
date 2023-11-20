package _01_basic_syntax;

import java.util.Scanner;

//형변환
//-데이터 타입 변화
//-(type) var
//  -type:데이터 타입
//  -var:변수명
public class Casting {
    public static void main(String[] args) {
//        묵시적 형변환(Wider Conversion)
//        -작은 타입에서 큰 타입으로 자동 형변환
//        -반대의 경우에는 명시적으로 형변환 해야 함
        int smallNumber=10;
        double bigNumber=smallNumber;//int를 double로 자동 형변환
        System.out.println("smallNumber: "+smallNumber);
        System.out.println("bigNumber: "+bigNumber);

//        명시적 형변환(Narrow Conversion)
//        -더 큰 타입에서 작은 타입으로 강제 변환
//        -주의) 큰 타입에서 작은 타입으로 강제 변환을 하다보니 데이터 손실이 날 수 있음
        double anotherBigNumber=20.5;
        int anotherSmallNumber=(int)anotherBigNumber;
        System.out.println("anotherBigNumber: "+anotherBigNumber);
        System.out.println("anotherSmallNumber: "+anotherSmallNumber);
        Scanner sc2=new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name2=sc2.nextLine();
        System.out.println("니이를 입력하세요:");
        int age2=sc2.nextInt();
        System.out.println("안녕하세요! "+name2+"님"+"("+age2+")");
        sc2.close();
    }
}
