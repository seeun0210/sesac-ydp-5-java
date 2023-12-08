package _09_dependency_injection;

public class DbBoardRepository implements IBoardRepository{
    @Override
    public void save() {
        System.out.println("게시판 DB에 저장중...");
    }

    @Override
    public void delete() {
        System.out.println("게시판 DB에서 삭제중...");
    }
}
