package javaCollectionFramework;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");  // 자바는 한 번만 저장됨
        set.add("iBATIS");

        int size = set.size(); // 저장된 객체 수 얻기
        System.out.println("총 객체수 : " + size);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수 : " + set.size());

        iterator = set.iterator();
        for(String element : set) { // 객체 수만큼 루핑
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
