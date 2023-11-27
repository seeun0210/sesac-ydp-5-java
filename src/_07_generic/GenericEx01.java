package _07_generic;

import java.util.ArrayList;

//일반 클래스
class CustomList{
    ArrayList<String>list=new ArrayList<>();
    public void addElement(String element){
        list.add(element);
    }
    public void removeElement(String element){
        list.remove(element);
    }

    @Override
    public String toString() {
        return "CustomList=" + list;
    }

    public String get(int idx){
        return list.get(idx);
    }

}
//제네릭 클래스
class CustomListGeneric<T>{
    ArrayList<T>list=new ArrayList<>();
    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }

    @Override
    public String toString() {
        return "CustomList=" + list;
    }

    public T get(int idx){
        return list.get(idx);
    }

}
public class GenericEx01 {
    public static void main(String[] args) {
//not using generic
        CustomList li =new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString());//CustomList=[first, second, third]
        li.removeElement("second");
        System.out.println(li.toString());

        String str=li.get(1);//CustomList=[first, third]
        System.out.println(str);//third
        System.out.println();

        //using generic
        CustomListGeneric<Integer>gLi=new CustomListGeneric<>();
                gLi.addElement(3);
                gLi.addElement(6);
                gLi.addElement(9);
                gLi.addElement(12);
        System.out.println(gLi.toString());//CustomList=[3, 6, 9, 12]

        gLi.removeElement(9);
        System.out.println(gLi.toString());//CustomList=[3, 6, 12]

        Integer value=gLi.get(1);
        System.out.println(value);//6
        System.out.println();

        CustomListGeneric<Character>gLi2=new CustomListGeneric<>();
        gLi2.addElement('A');
        gLi2.addElement('B');
        gLi2.addElement('C');
        gLi2.addElement('D');
        gLi2.addElement('E');
        System.out.println(gLi2.toString());//CustomList=[A, B, C, D, E]

        gLi2.removeElement('D');
        System.out.println(gLi2.toString());//CustomList=[A, B, C, E]

        Character ch=gLi2.get(3);
        System.out.println(ch);//E






    }
}
