package _05_class._abstract;

public class Kim extends Student{
    public Kim (String school,String name, int age, String studentId){
        super(school,name,age,studentId);
    }

    @Override
    public void todo() {
        System.out.println("김가네 김밥");
    }

    @Override
    public void StudentInfo(String name, String school, int age, String studentId) {
        super.StudentInfo(name, school, age, studentId);
    }
}
