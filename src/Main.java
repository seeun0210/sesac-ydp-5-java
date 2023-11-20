//메인 클래스 (시작클래스) 정의
//-main메서드 가짐
//-메인 클래스는 한 개!(Node)에서 진입접 파일 역할
//주석
//1. //한줄
//2. /*여러 줄 */
//3. /** 문서 주석 */

//main 메서드
//-자바 응용 프로그램의 실행 시작점
//-애플리케이션이 실행되려면 최소 1개 존재해야 함
//-JVM은 세미콜론(;)으로 끝나느 문장을 하나의 명령문으로 인식
public class Main {
    public static void main(String[] args) {
        System.out.print("JAVA STUDY START!");
        //printf는 개행처리까지는 안해줌
        System.out.println("yeah!!");
        //println은 개행처리까지 해줌(줄바꿈해줌)

        //public은 누구나 접근할 수 있는 키워드
        //static은 객체를 생성하지 않고 바로 시작하는 메서드
        //void는 메서드가 반환하는 값이 없다는 걸 나타냄
        //string[] args 얘가 매개변수
        System.out.println("안녕하세요!");
        for (int i=0;i<=5;i++){
            System.out.println("i="+i);
        }
    }
}