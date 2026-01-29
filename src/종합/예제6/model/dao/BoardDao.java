package 종합.예제6.model.dao;

import 종합.예제6.model.dto.BoardDto;
import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static  final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // [*] 데이터베이스 역할 하는 ArrayList < 추후에 삭제 예정 >
    private ArrayList<BoardDto> boardDB = new ArrayList<>();
}










