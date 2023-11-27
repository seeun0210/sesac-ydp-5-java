package _05_class._interface;

public interface RemoteControl {
    //추상 메소드
    public void turnOn();
    public void turnOff();

    //상수 필드
    //-인터페이스에 선언된 필드는 모두 "public static final"특성을 가짐
    //-따라서, 생략하더라도 컴파일 과정에서 자동으로 붙게 됨
    int MAX_VOLUME=10;
    int MIN_VOLUME=0;

    void setVolume(int volume);
}
