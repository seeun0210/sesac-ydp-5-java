package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ArrayListEx {
    public static void main(String[] args) {
        //1. ArrayList 생성(정수형 요소를 저장하는 예제)
        List<Integer> numbers=new ArrayList<>();

        //2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        //3. 요소 접근
        System.out.println("첫번째 요소 : "+numbers.get(0));
        System.out.println("두번째 요소 : "+numbers.get(1));
        //4. 요소 수정
        numbers.set(1,77);
        System.out.println("수정된 두번째 요소: "+numbers.get(1));
        System.out.println(numbers);
        //5. 요소 삽입
        numbers.add(1,7);
        System.out.println(numbers);
        //6. Arraylist끼리 연결
        List<Integer> numbers2=new ArrayList<>(Arrays.asList(100,99,98));
        numbers.addAll(numbers2);
        System.out.println("numbers: "+numbers);
        //7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(50));
        System.out.println(numbers.indexOf(88));
        //8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers : "+numbers);
        //9. 리스트 크기 확인
        System.out.println("numbers length : "+numbers.size());
        //10. 모든 요소 출력(반복문)
        for(Integer n:numbers){
            System.out.print(n+" ");
        }
        System.out.println();
        //11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers: "+numbers);
        //////////////////////////////////
        //Student 타입 ArrayList 생성
        List<Student>students=new ArrayList<>();
        students.add(new Student("John",10));
        students.add(new Student("Jennie",11));
        students.add(new Student("Rose",12));
        students.add(new Student("Lily",13));
        System.out.println("학생 수: "+students.size());
        Student std1=students.get(0);
        System.out.println(std1);
        System.out.println(std1.getName()+"학생의 나이는"+std1.getAge()+"세 입니다.");
        for(Student student:students){
            System.out.println(student);
        }
        students.remove(2);
        System.out.println(students);
    }
}
class Student{
    private String name;
    private int age;
    //생성자
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Student(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}