package _07_generic;

class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return  num1.doubleValue() + num2.doubleValue();
    }
}

class Kind<T> {
    public T kind;

    public Kind(T kind) {
        this.kind = kind;
    }
}

public class GenericPractice2 {
    public static void main(String[] args) {

        Calculator<Integer> intCalculator = new Calculator<>(5, 10);
        System.out.println("Integer Sum: " + intCalculator.add());


        Calculator<Double> doubleCalculator = new Calculator<>(3.5, 7.2);
        System.out.println("Double Sum: " + doubleCalculator.add());
    }
}
