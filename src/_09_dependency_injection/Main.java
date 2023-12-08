package _09_dependency_injection;

import _05_class._access_modifier._pack01.B;

public class Main {
    public static void main(String[] args) {
        IBoardRepository iBoardRepository=new FileBoardRepository();
//        IBoardRepository iBoardRepository=new DbBoardRepository();
        //파일에서 데이터베이스로 기획이 변경되었는데, repository가 바뀌었는데 서비스 코드를 변경하지 않고 이 한줄만 변경하면 된다!!
//        BoardService boardService=new BoardService(iBoardRepository);

        //2. setter를 이용한 DI
        BoardService boardService=new BoardService();
        boardService.setiBoardRepository(iBoardRepository);
        boardService.save();
        boardService.delete();
    }
}
