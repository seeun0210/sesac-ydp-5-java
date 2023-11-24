package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        //std1 변수가 Student 객체 참조
        Student std1=new Student("김새싹",1);
        System.out.println(std1);
        std1.goToSchool();
        std1.study("JAVA programming");
        System.out.println(std1.getGrade()+"학년");
    }
}
