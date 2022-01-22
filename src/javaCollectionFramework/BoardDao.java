package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Boardd> getBoardList() {
        List<Boardd> list = new ArrayList<Boardd>();
        list.add(new Boardd("제목1", "내용1"));
        list.add(new Boardd("제목2", "내용2"));
        list.add(new Boardd("제목3", "내용3"));
        return list;
    }
}
