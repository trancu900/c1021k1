package managerNew.old;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        view();
    }

    private static void menu() {
        System.out.println("Welcome to menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("7. Thoat");
        System.out.print("Lua chon chuc nang theo so:");
    }

    public static void view() {
        ProductManager productManager = new ProductManager();
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.update();
                    break;
                case 3:
                    break;
                case 4:
                    productManager.show();
                    break;
                case 5:
                    productManager.findByName();
                    break;
                case 6:
                    productManager.sort();
                    productManager.show();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong dung chuc nang!");
            }
        }
    }
}
