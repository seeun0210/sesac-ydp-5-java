package _09_dependency_injection;
//"파일"에 게시판 목록을 저장하는 클래스

public class FileBoardRepository implements IBoardRepository {

    @Override
    public void save() {
        System.out.println("게시판 저장중...");
    }

    @Override
    public void delete() {
        System.out.println("게시판 삭제중...");
    }
}
