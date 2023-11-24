package _05_class._static;

public class Student {
    static String name;
    static int student_ID;
    static int grade;
static int totalStudents;
    public Student(String name, int student_ID, int grade) {
        this.name=name;
        this.student_ID=student_ID;
        this.grade=grade;
        totalStudents++;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getStudent_ID() {
        return student_ID;
    }

    public static void setStudent_ID(int student_ID) {
        Student.student_ID = student_ID;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }
   public static void displayInfo(){
       System.out.println("===학생 정보===");
       System.out.println("이름 : "+getName());
       System.out.println("학번 : "+getStudent_ID());
       System.out.println("학년 : "+getGrade());;
   }
}
