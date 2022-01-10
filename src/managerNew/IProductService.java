package managerNew;

public interface IProductService {
    boolean exist(int id);

    void add(Product product);

    void update(Product product);

    void show();

    Product findByName(String o);

    void sort();

}
