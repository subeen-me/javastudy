package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<Studentt> set = new HashSet<Studentt>();

        set.add(new Studentt(1, "홍길동"));
        set.add(new Studentt(2, "신용권"));
        set.add(new Studentt(1, "조민우"));

        Iterator<Studentt> iterator = set.iterator();
        while (iterator.hasNext()) {
            Studentt student = iterator.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}
