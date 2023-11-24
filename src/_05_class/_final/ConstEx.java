package _05_class._final;

public class ConstEx {
    //상수 읽기
    //static 필드 이므로 객체 생성없이 ,클래스명.필드명으로 바로 접근
    public static void main(String[] args) {
        System.out.println(Const.MAX_VALUE);
        System.out.println(Const.GREETING);

        //상수는 final 하므로 값을 수정할 수 없음.
//        Const.MAX_VALUE=10;
//        Const.GREETING="Hello JAVA";
    }
}
