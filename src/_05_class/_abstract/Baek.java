package _05_class._abstract;

public class Baek extends Student{
    public Baek (String school,String name, int age, String studentId){
        super(school,name,age,studentId);
    }
    @Override
    public void todo() {
        System.out.println("백종원 피자");
    }

    @Override
    public void StudentInfo(String name, String school, int age, String studentId) {
        super.StudentInfo(name, school, age, studentId);
    }
}
