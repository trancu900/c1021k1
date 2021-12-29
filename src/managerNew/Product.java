package managerNew;

public class Product implements Comparable {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String raw) {
        String[] strings = raw.split(",");
        id = Integer.parseInt(strings[0]);
        name = strings[1];
        price = Double.parseDouble(strings[2]);
        quantity = Integer.parseInt(strings[3]);
    }

    public static Product parseProduct(String raw) {
        String[] strings = raw.split(",");
        int id = Integer.parseInt(strings[0]);
        String name = strings[1];
        double price = Double.parseDouble(strings[2]);
        int quantity = Integer.parseInt(strings[3]);
        return new Product(id, name, price, quantity);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%f,%d", id, name, price, quantity);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
