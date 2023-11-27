package _07_generic;

class Pair<T, U> {
    T key;
    U value;
}

public class GenericPractice1 {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>();
        ((Pair<String, Integer>) pair1).key = "One";
        ((Pair<String, Integer>) pair1).value = 1;
        System.out.println("Key: "+pair1.key+","+"Value: "+pair1.value);
        Pair<Integer,String> pair2 = new Pair<>();
        ((Pair<Integer,String>) pair2).key = 2;
        ((Pair<Integer,String>) pair2).value = "Two";
        System.out.println("Key: "+pair2.key+","+"Value: "+pair2.value);
    }
}
