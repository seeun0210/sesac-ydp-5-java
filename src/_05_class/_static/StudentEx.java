package _05_class._static;


public class StudentEx {
    public static void main(String[] args) {
        Student std1=new Student("김새싹",20231001,1);
        Student std2=new Student("박지은",20231002,2);
        Student std3=new Student("이은지",20231003,3);
        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();
        System.out.printf("총 학생수는 %d명 입니다.",Student.totalStudents);

    }

}
