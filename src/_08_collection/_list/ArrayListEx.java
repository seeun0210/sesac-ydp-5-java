package _08_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<Book>list=new ArrayList<>();
        //객체 추가
        list.add(new Book ("제목1", "지은이1"));
        list.add(new Book ("제목2", "지은이2"));
        list.add(new Book ("제목3", "지은이3"));
        list.add(new Book ("제목4", "지은이4"));
        list.add(new Book ("제목5", "지은이5"));
        //리스트 개수 얻기
        int size=list.size();
        System.out.printf("총d권의 책이 존재합니다.%n%n",size);
        //특정 인덱스 객체 가져오가
        Book thirdBook=list.get(2);
        System.out.println(thirdBook);
        //인스턴스 특정 객체 삭제
        list.remove(2);
        list.remove(2);
        System.out.println(list);
        //반복문으로 모든 객체 하나씩 가져오기
        for (Book b:list){
            System.out.println(b);
        }
        //모든 객체 삭제
        System.out.println("객체가 비었나요? "+list.isEmpty());
        list.clear();
        System.out.println("객체가 비었나요? "+list.isEmpty());


    }
    }

