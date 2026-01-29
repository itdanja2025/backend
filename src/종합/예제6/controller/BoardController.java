package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;

public class BoardController {
    // [*] 싱글톤 생성
    private BoardController(){};
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

}
