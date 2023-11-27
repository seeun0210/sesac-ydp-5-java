package _05_class._abstract;

public class Student {
    String name;
    int age;
    String studentId;
    String school;
    public Student(
){
        this.school=school;
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }

    public Student(String school, String name, int age, String studentId) {
    }

    void todo() {
    }

    public void lunch(){
        System.out.print("점심은 ");
    }
    public void StudentInfo(String name,String school, int age, String studentId){
        System.out.println("====="+name+"학생의 정보=====");
        System.out.println("학교: "+school);
        System.out.println("학번: "+studentId);
    }
}
