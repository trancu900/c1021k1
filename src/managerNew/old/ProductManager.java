package managerNew.old;


import managerNew.PriceSortASC;
import managerNew.PriceSortDESC;
import managerNew.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        products.add(new Product(2, "duong", 62, 5));
        products.add(new Product(3, "dan", 74, 5));
        products.add(new Product(4, "anh", 44, 5));
        products.add(new Product(5, "cu", 43, 5));
    }

    public void add() {
        do {

            System.out.println("enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter name: ");
            String name = scanner.nextLine();
            System.out.println("enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            Product product = new Product(id, name, price, quantity);
            products.add(product);
            System.out.println(product);
            System.out.println("Nhấn 'y' để sản phẩm mới \t|\t 'q' để quay lại \t|\t 't' để thoát");
            System.out.print(" ⭆ ");
            String option = scanner.nextLine();
            switch (option) {
                case "q":
                    return;
                case "t":
                    System.exit(0);
            }
        } while (true);
    }

    public void update() {
        System.out.println("nhap id can sua: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = findById(id);
        if (product == null) {
            System.out.println("Khong co san pham nay");
            return;
        }
        System.out.println("Nhap ten can sua: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia can sua: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap so luong can sua: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        show();
    }

    public void show() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void findByName() {
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay");
        }
    }

    public boolean exist(int id) {
        return findById(id) != null;
        //   Product product = findById(id);
//        if(product!=null)
//            return true;
//        else
//            return false;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void sort() {
        do {
            System.out.println("ban muon sap xep theo: ");
            System.out.println("1: gia giam dan");
            System.out.println("2: gia tang dan");
            System.out.println("3: thoat");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    products.sort(new PriceSortDESC());
                    return;
                case 2:
                    products.sort(new PriceSortASC());
                    return;
                default:
                    System.out.println("nhap 1 hoac 2");
                    break;
            }
            if (option == 3) break;
        }
        while (true);
    }


}
