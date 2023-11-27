package _05_class;

import _05_class._abstract.Baek;
import _05_class._abstract.Kim;

public class StudentTest {
    public static void main(String[] args) {
        Kim kim=new Kim("ABC 고등학교","김철수",17,"20220001");
        Baek baek=new Baek("XYZ 고등학교","백영희",18,"20220002");
        kim.StudentInfo("김철수","ABC 고등학교",17, "20220001");
        kim.lunch();
        kim.todo();

        baek.StudentInfo("백영희","XYZ 고등학교", 18, "202200002");
        baek.lunch();
        baek.todo();
    }
}
