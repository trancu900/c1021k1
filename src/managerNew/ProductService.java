package managerNew;


import managerNew.exceptions.ExistException;
import managerNew.exceptions.ValidateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static ProductService instance;
    private ProductService() {
    }
    public static ProductService getInstance() {
        if (instance == null)
            instance = new ProductService();
        return instance;
    }

    private List<Product> products = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

//    public ProductService() {
//        products.add(new Product(2, "duong", 62, 5));
//        products.add(new Product(3, "dan", 74, 5));
//        products.add(new Product(4, "anh", 44, 5));
//        products.add(new Product(5, "cu", 43, 5));
//    }

    public void add(Product product) {
        products.add(product);
    }

    public void update(Product newProduct) {
        Product product = findById(newProduct.getId());
        if (product == null)
            throw new ExistException("San phan ko ton tai");
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setQuantity(newProduct.getQuantity());
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

    public Product findByName(String name) {
        if (name == null)
            throw new ValidateException("Name must not null");
        for (Product product : products) {
            if (product.getName().equals(name)) {
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
