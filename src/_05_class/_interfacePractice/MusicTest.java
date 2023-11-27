package _05_class._interfacePractice;

public class MusicTest {
    public static void main(String[] args) {
        Music music;
        music=new Mp3Player("아이유 블루밍");
        music.play();
        music.stop();
        music=new CdPlayer("아이유 꽃갈피");
        music.play();
        music.stop();

    }
}
