package _08_collection._map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map컬렉션
//-key,value=> entry
//-키는 중복 X, 값은 중복 O
//-기존에 저장된 키와 동일한 키로 값을 저장하면? 기존 값이 새로운 값으로 대체됨.
public class HashMapEx {
    public static void main(String[] args) {
        //key(id), value(name) HashMap

        //Map 컬렉션 생성
        Map<Integer,String> map=new java.util.HashMap<>();

        //entry추가
        map.put(1001, "홍길동");
        map.put(1002,"성춘향");
        map.put(1003,"강혜린");
        map.put(1004,"홍길동");

        //전체 객체 수
        System.out.printf("총 %d 명의 학생이 있습니다. %n%n",map.size());//4//값은 중복되어도 괜찮다!!

        //키로 값 얻기
        int key=1003;
        String value=map.get(key);
        System.out.printf("%d 번에 해당되는 학생은 %s입니다. %n%n",key,value);

        //키와 값으로 구성된 모든 Map.Entry 객체들을 Set 담아 리턴
        Set<Entry<Integer, String>> entrySet=map.entrySet();
        System.out.println(entrySet);
        System.out.println();

        //iterator로 반복해서 엔트리 출력하기
        Iterator<Entry<Integer,String>>iterator=entrySet.iterator();
        while(iterator.hasNext()){
            Entry<Integer,String>entry=iterator.next();
            Integer k=entry.getKey();
            String v=entry.getValue();
            System.out.printf("%s학생은 %d번 입니다.%n", v,k);


        }
        System.out.println();

        //키에 대한 Set 컬렉션
        Set<Integer>keySet=map.keySet();
        System.out.println(keySet);

        //주어진 키와 일치하는 entry삭제
        String deletedValue=map.remove(key);
        System.out.printf("%s학생이 삭제되었습니다. %n ",deletedValue);
        int size2=map.size();
        System.out.printf("총 %d명의 학생이 있습니다%n",size2);
    }
}
