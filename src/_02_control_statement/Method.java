package _02_control_statement;
// 메소드
// -객체가 갖는 기능(동작)
/* 접근 제한자 리턴 타입 메소드명(매개변수1, 매개변수2, ...){
// 메서드 행위
// return 반환값;
}*/
public class Method {
    public static void main(String[] args){
        //함수 호출
        hello();
        System.out.println(sum1(1,2));
        System.out.println(sum2(3,4));
int[] numbers={10,20};
int[] numbers2={10,20,30,40,50};
        System.out.println(mul1(numbers[0],numbers[1]));
        System.out.println(mul2(numbers2));
    }
    //메소드
//    1. 반환값이 없는 메소드
//    static이 있으면 인스턴스 것,
    public static void hello(){
        System.out.println("안녕 자바야!");
    }
//    2.반환값이 있는 메소드
//    -"리턴 타입"과 return 에서 실제 반환하는 데이터 형식이 일치해야 함
    public static int sum1(int x, int y) {
        return x + y;
    }
    public static String sum2(int x, int y) {
        return "x+y="+x + y;
    }
//    함수 호출

    //call by reference(참조 전달)
    public static int mul1(int x, int y){
        return x*y;
    }
    public static int mul2(int[] nums){
        int sum=1;
        for(int i =0; i<nums.length;i++){
            sum*=nums[i];
        }
        return sum;
    }





}
