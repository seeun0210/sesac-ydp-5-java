package _09_dependency_injection;
//게시판 목록을 관리하는 기능을 제공하는 클래스(save, delete)
public class BoardService {
    //1. 생성자를 이용한 DI(dependency Injection)
//    private final IBoardRepository iBoardRepository;//final은 값이 저장이 되면 바뀌면 안됨
//    public BoardService(IBoardRepository iBoardRepository){
//        this.iBoardRepository=iBoardRepository;
//        //객체생성할 때 초기화를 해줌
//        //외부에서 의존성 주입을 구현
//
//    }
    //2. setter를 이용한 DI: setter는 값을 바꿀 수 있기 때문에 final을 붙이지 않음
    private IBoardRepository iBoardRepository;
    public void setiBoardRepository(IBoardRepository iBoardRepository){
        this.iBoardRepository=iBoardRepository;
    }
    public void save(){
        iBoardRepository.save();
    }
    public void delete(){
        iBoardRepository.delete();
    }
}
