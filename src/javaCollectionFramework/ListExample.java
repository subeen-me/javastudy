package javaCollectionFramework;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Boardd> list = dao.getBoardList();
        for(Boardd board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
