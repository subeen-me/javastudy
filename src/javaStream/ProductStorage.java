package javaStream;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
    private List<Product> list = new ArrayList<>(); // list 컬렉션 생성
    private Scanner scanner = new Scanner(System.in); // 키보드 입력 scanner 생성
    private int counter; // pno 제공 카운터

    public void showMenu() {
        while (true){
            System.out.println("----------------------");
            System.out.println(" 1.등록 | 2.목록 | 3.종료 ");
            System.out.println("----------------------");

            System.out.print("선택 : ");
            String selectNo = scanner.nextLine(); // 번호 읽기
            switch (selectNo) {
                case "1" : registerProduct(); break; // product 등록
                case "2" : showProducts(); break; // 등록된 모든 product 정보 보기
                case "3" : return; // 프로그램 종료
            }
        }
    }

    private void registerProduct() {
        try {
            Product product = new Product();
            product.setPno(++counter); // pno 세팅

            System.out.print("상품명: ");
            product.setName(scanner.nextLine()); // 이름을 읽고 세팅

            System.out.print("가격: ");
            product.setPrice(Integer.parseInt(scanner.nextLine())); // 가격을 읽고 세팅

            System.out.print("재고:");
            product.setStock(Integer.parseInt(scanner.nextLine())); // 재고를 읽고 세팅

            list.add(product); // list에 product 저장
        } catch (Exception e) {
            System.out.println("등록 에러 : " + e.getMessage());
        }
    }

    private void showProducts() {
        // 리스트에 저장된 모든 product 정보를 모니터에 출력
        for(Product p : list) {
            System.out.println(p.getPno() + "\t" + p.getName() + "\t" +
                    p.getPrice() + "\t" + p.getStock());
        }
    }
}
