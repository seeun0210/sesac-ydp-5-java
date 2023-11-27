package _05_class._interface;

public class InterfaceEx03 {
    public static void main(String[] args) {
        //interface 도 하나의 타임; 참조형!! -> 변수타입 사용가능
        //-참조 타입 이므로 null가능
        RemoteControl rc;
        //1.모니터 객체 생성
        rc=new Monitor();
        rc.turnOn();
        rc.setVolume(4);
        rc.turnOff();
        //2. 스피커 객체 생성, rc 변수의 객체를 교체
        rc=new Speaker();
        rc.turnOn();
        rc.setVolume(5000);
        rc.turnOff();
        //인터페이스에 정의된 상수는 "구현 객체"와는 상관 없는 인터페이스 솟기이므로
        //아래와 같이 바로 접근 가능!!
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

    }
}
