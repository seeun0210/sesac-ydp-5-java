package _05_class._final;
//final필드
//-final 키워드가 지정된 변수는 한 번 초기화되면 값 변경 불가능
public class FinalVariableEx {
    public static void main(String[] args) {
        //final 변수 선언, 초기화
        final int finalNum=1;
//        finalNum=5;//final field는 값을 변경할 수 없으므로 컴파일 에러 발생!
        //final field는 오로지 "읽기 전용"으로만 쓰인다
        System.out.println("Final Number::"+finalNum);
    }
}
