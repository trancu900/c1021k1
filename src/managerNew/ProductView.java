package managerNew;


import java.util.Scanner;

public class ProductView {

    private IProductService productService = ProductService.getInstance();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Welcome to menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("7. Thoat");

    }

    public void seletion() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lua chon chuc nang theo so:");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    Product product = newProduct();
                    if (productService.exist(product.getId())) {
                        System.out.println("San Phan da ton tai");
                        continue;
                    }
                    productService.add(product);
                    System.out.println("Them san pham thanh cong");
                    break;
                case 2:
                    System.out.println("enter id: ");
                    int id = ParseUtils.retryParseInt("");
                    if (!productService.exist(id)) {
                        System.out.println("San Phan ko ton tai");
                        continue;
                    }
                    product = newProduct1();
                    product.setId(id);
                    productService.update(product);
                    break;
                case 3:
                    break;
                case 4:
                    productService.show();
                    break;
                case 5:
                    System.out.println("Nhap ten san pham: ");
                    String name = scanner.nextLine().toLowerCase();
                    productService.findByName(name);
                    break;
                case 6:
                    productService.sort();
                    productService.show();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong dung chuc nang!");
            }
        }
    }

    public Product newProduct() {
        String message = "Nhap sai vui long nhap lai";
        System.out.println("enter id: ");
        int id = ParseUtils.retryParseInt(message);

        System.out.println("enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter price: ");
        int price = ParseUtils.retryParseInt(message);
        System.out.println("enter quantity: ");
        int quantity = ParseUtils.retryParseInt(message);

        // Product product = new Product(id, name, price, quantity);
        //  return product;
        return new Product(id, name, price, quantity);
    }

    public Product newProduct1() {
        String message = "Nhap sai vui long nhap lai";
        System.out.println("enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter price: ");
        int price = ParseUtils.retryParseInt(message);
        System.out.println("enter quantity: ");
        int quantity = ParseUtils.retryParseInt(message);

        // Product product = new Product(id, name, price, quantity);
        //  return product;
        return new Product(name, price, quantity);
    }


}
