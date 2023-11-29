package _08_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //ArrayList 컬렉션 객체 생성
        List<String> list1=new ArrayList<>();
        //LinkedList 컬렉션 객체 생성
        List<String>list2=new LinkedList<>();
        //시작, 끝 변수 선언
        long startTime;
        long endTime;
        //ArrayList 의 0번 인덱스에 데이터 추가(100000회 반복)
        startTime=System.nanoTime();
        for (int i=0;i<=10000;i++){
            list1.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.println("ArrayList 소요시간:"+(endTime-startTime));

        startTime=System.nanoTime();
        for (int i=0;i<=10000;i++){
            list2.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.println("LinkedList 소요시간:"+(endTime-startTime));
    }
    //결과 해석
    //-LinkedList가 ArrayList보다 요소 추가에 대해서 더 빠른 성능을 냄
    //-ArrayList는 0번 인덱스에 새로운 요소룰 추가하면서 기존 요소 인덱스를 한칸씩 뒤로 미는 작업을 해야하기 때문

    //ArrayList vs LinkedList
    //*ArrayList
    //-내부 배열에 객체를 저장
    //-징점: "인덱스를 사용한 요소 접근"이 빠름
    //*LinkedList
    //-인접 객체를 체인처럼 연결해서 관리
    //-객체를 삽입/삭제 하면 바로 앞뒤 링크만 변경해주면 되므로 "자주 객체 삽입/삭제 발생하는 곳"에서 유리하다.
}
