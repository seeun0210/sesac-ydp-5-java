package _05_class._access_modifier._pack02;

import _05_class._access_modifier._pack01.B;//다른 패캐지의 클래스는 import문으로 불러온다!

public class C {
//    A a;//error
    B b;
    //C 클래스는 A,B클래스와 패키지가 다르므로
    //default 제한자인 A클래스는 불러올 수 없고,
    //public 제한자인 B클래스는 불러올 수 있다.
}
