package _07_generic;
class Person{}
class Teacher extends Person{}
class Student extends Person{}
class WebStudent extends Student{}
class MobileStudent extends Student{}
//등록 객체
//-특정 종류(T) 등록을 나타내는 클래스
class Applicant<T>{
    public T kind;
    public Applicant(T kind){this.kind=kind;}
}
//과정
//-getClass(): 클래스 정보를 반환(ex. class java.lang.String)
//-getSimpleName(): 클래스의 간결한 이름 반환(ex. String)
class Course{
    //Course A: Person 이라면 누구나 등록 가능
    public static void registerCourseA(Applicant<?>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"님이 Course A에 등록하셨습니다.");

    }
    //Course B: Teacher나 Student가 아닌 Person만 등록 가능
    public static void registerCourseB(Applicant<? super Teacher>applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "님이 Course B에 등록하셨습니다.");
    }
    //Course C: Student만 등록 가능
    public static void registerCourseC(Applicant<? extends Student>applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "님이 Course C에 등록하셨습니다.");
    }

}

public class GenericEx03 {
    public static void main(String[] args) {
        System.out.println("======courseA======");
        Course.registerCourseA(new Applicant<Person>(new Person()));
        Course.registerCourseA(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseA(new Applicant<Student>(new Student()));
        Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseA(new Applicant<MobileStudent>(new MobileStudent()));
        System.out.println("======courseB======");
        Course.registerCourseB(new Applicant<Person>(new Person()));
        Course.registerCourseB(new Applicant<Teacher>(new Teacher()));
//        Course.registerCourseB(new Applicant<Student>(new Student()));
//        Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));
//        Course.registerCourseB(new Applicant<MobileStudent>(new MobileStudent()));
        System.out.println("======courseC======");
//        Course.registerCourseC(new Applicant<Person>(new Person()));
//        Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseC(new Applicant<Student>(new Student()));
        Course.registerCourseC(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseC(new Applicant<MobileStudent>(new MobileStudent()));


    }
}
