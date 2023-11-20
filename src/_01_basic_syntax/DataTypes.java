package _01_basic_syntax;
// Primitive Type
// - 비객체 타입 -> null 값 가질 수 없읍

// Reference Type
// - java.lang.Object 상속
// - 기본형이 아니면 참조형
public class DataTypes {
    public static void main(String[] args){
        System.out.println("=====Primitive Type(기본형)=======");
//       정수형 변수
        int x=10;
        long y=100000000L;//long 타입은 뒤에 L, l 붙어야 함
        short z=32767;
        byte b=127;
//        타입에 따라 저장될 수 있는 변수의 범위가 다르다( byte < short < int < long)
        
//        실수형 변수: 저장할 수 있는 변수의 범위(float<double)
        float a= 3.14f;//float은 뒤에 f붙어야 함
        double c=2.71828;//double은 float의 2배를 저장 할 수 있고, 뒤에 f같은거 안붙여도 됨
        
//        문자형 변수 선언
//        -유니코드(세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약) 저장
        char ch='A'; //char 자료형은 단따옴표로 문자 하나! //A는 65와 매핑
        char ch2='가';//44032와 매핑

//        논리형 변수
        boolean bool=true;
        boolean bool2=false;

//        변수 출력
        System.out.println("정수형 변수:"+x+","+y+","+z+","+b);
        System.out.println("실수형 변수:" +a+","+c);
        System.out.println("문자형 변수:"+ch+","+ch2);
        System.out.println("논리형 변수:"+bool+","+bool2);

/////////////////////////////////////////////////////////////////////
        System.out.println("========Reference Type(참조형)============");
        
//        String 참조형 변수
//        -java에서 String 타입은 특별함. 참조형인데 기본형처럼 사용함
//        -기본 자료형은  == 연산자로 비교
//        -String 객체간 비교는 .equals() 메서드 사용해서 비교
        String greeting="hello, world";

//        배열(Array)
//        js와 달리 한 배열의 원소들의 type은 동일해야함
        int[] numbers={1,2,3,4,5};
//        각각의 원소가 int이고 크기가 5인 배열 numbers

//        클래스(Class)
        Person person = new Person("John", 30);
        Person person2= new Person("seeun", 25);
        System.out.println("String 변수 :"+greeting);
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");

        }
        System.out.println();
        System.out.println("Person 객체:" +person.getName()+","+person.getAge());
        System.out.println("Person2 객체:"+person2.getName()+","+person.getAge());
    }
}
class Person{
//    필드(속성)
    private String name;
    private int age;

//    생성자
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }



}