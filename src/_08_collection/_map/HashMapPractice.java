package _08_collection._map;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        String name = "";
        int age;
        Scanner sc= new Scanner(System.in);
        while(!name.equals("종료")){

            System.out.printf("이름입력: ");
            name=sc.next();

            if(name.equals("종료")){
                break;
            }
            System.out.printf("나이입력: ");
            age=sc.nextInt();
            map.put(name,age);

        }
        System.out.println("==입력 받은 이름과 나이 목록==");
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<String,Integer>>iterator= entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer>entry=iterator.next();
                    String nameEntry=entry.getKey();
                    Integer ageEntry=entry.getValue();
            System.out.printf("이름: %s,나이: %d %n",nameEntry,ageEntry);
        }
    }
}
