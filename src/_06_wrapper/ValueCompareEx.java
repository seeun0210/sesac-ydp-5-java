package _06_wrapper;
//포장 값 비교
//-래퍼 클래스는 참조형이기 때문에 객체 내부 값 비교할 때, ==, != 연산자 사용 부적합
//-객체 내부 값이 아닌 포장 객체의 주소값을 비교하기 때문
//-.equals() 메소드로 내부 값 비교 하는 것이 바람직하다
public class ValueCompareEx {
    public static void main(String[] args) {
        //-128 ~ 127 아내의 값을 갖는 경우
    Integer obj1=10;
    Integer obj2=10;
        System.out.printf("%d == %d: %b %n",obj1,obj2,obj1==obj2);//true
        System.out.printf("%d == %d: %b %n",obj1,obj2,obj1.equals(obj2));//true
    Integer obj3=1000;
    Integer obj4=1000;
        System.out.printf("%d == %d: %b %n",obj3,obj4,obj3==obj4);//false-> 주소값을 비교하기 때문
        System.out.printf("%d == %d: %b %n",obj3,obj4,obj3.equals(obj4));//true

    Boolean bool1=true;
    Boolean bool2=true;
        System.out.printf("%b==%b:%b %n",bool1,bool2,bool1==bool2);//true
        System.out.printf("%b==%b:%b %n",bool1,bool2,bool1.equals(bool2));//true
    Character char1='A';
    Character char2='A';
        System.out.printf("%c==%c :%b %n",char1,char2,char1==char2);//true
        System.out.printf("%c==%c :%b %n",char1,char2,char1.equals(char2));//true
    Character char3='\u0101';
    Character char4='\u0101';
        System.out.printf("%c==%c : %b %n",char3,char4,char3==char4);//false
        System.out.printf("%c==%c : %b %n",char3,char4,char3.equals(char4));//true

    }

}
