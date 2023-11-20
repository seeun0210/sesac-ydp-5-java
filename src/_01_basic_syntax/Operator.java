package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x,y;
        double a,b;

//        대입연산자(=)
        x=10;
        y=20;
        a=5.0;
        b=10.0;

//        산술 연산자:숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("=====x,y======");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println(x%y);

        System.out.println("\n\n=====a,b======");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);

        System.out.println("=====증감 연산자=====");
        System.out.println(x+++"->"+x);//후위 증가 연산자(출력하고 나중에 증가)
        System.out.println(++x+"->"+x);//전위 증가 연산자(증가하고 출력)
        System.out.println(y--+"->"+y);//후외 감소
        System.out.println(--y+"->"+y);//전위 감소

//        산술적인 대입 연산자
        System.out.println("======산술적인 대입 연산자======");
        System.out.println(x);//12
        System.out.println(x+=5);//17
        System.out.println(x-=5);//12
        System.out.println(x*=5);//60
        System.out.println(x/=5);//12
        System.out.println(x%=5);//2

//        비교 연산자
        System.out.println("=====비교 연산자=====");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

//        논리연산자
        boolean j=true;
        boolean k=false;
        boolean l=true;
        System.out.println("=====논리 연산자====");
        System.out.println(j&&k);//AND:모두 참이어야 참
        System.out.println(j&&l);
        System.out.println(j||k);//OR: 둘중 하나라도 참이면 참
        System.out.println(j||l);
        System.out.println(!j);//NOT:부정

//        삼항 연산자
        System.out.println("======삼항 연산자======");
        System.out.println(x>y?"x는 y보다 큼":"x는 y보다 작거나 같음");
    }
}
