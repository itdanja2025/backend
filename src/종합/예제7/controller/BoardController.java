package 종합.예제7.controller;

import 종합.예제7.model.dao.BoardDao;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance;}

    private BoardDao bd = BoardDao.getInstance();
}
