package _02_control_statement;

public class OverloadingEx {
    public static void main(String[] args) {
        OverloadingEx ol2=new OverloadingEx();
        System.out.println(ol2.width(5.0));
        System.out.println(ol2.width(4,7,"rectangle"));
        System.out.println(ol2.width(6,3,"triangle"));
    }
    public double width(double a){
        return a*a*Math.PI;
    }
    public double width(double a,double b,String c){
        if(c.equals("rectangle")){
            return a*b;
        }else if(c.equals("triangle")){
            return a*b/2;

        }
        return 0;
    }
}
