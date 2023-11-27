package _05_class._interfacePractice;

public class Mp3Player implements Music {
    String title;
    public Mp3Player(String title){
        this.title=title;
    }
    public void setTitle() {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서"+title+"음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서"+title+"음악을 정지합니다.");
    }
}
