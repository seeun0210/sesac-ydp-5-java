package _05_class._inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1=new Student("김새싹",20);
        //Case1. 부모, 자식 클래스의 필드가 public인 경우
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//        System.out.println(std1.campus);//null
//        std1.say();
//        std1.eat("샐러드");
//        std1.setCampus("새싹 영등포");
//        System.out.println();
//        System.out.println(std1.campus);
        //case2. 부모, 자식 클래스의 필드가 private인 경우
        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getCampus());//null
        std1.say();
        std1.eat("샐러드");
        std1.setCampus("새싹 영등포");
        System.out.println();
        System.out.println(std1.getCampus());
    }
}
