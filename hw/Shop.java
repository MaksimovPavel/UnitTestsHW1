package seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Product> products;

    public Shop(){
        this.products = new ArrayList<>();
        }
    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    /**
     */
    public void getSortedListProducts() {
        products.sort((p1, p2) -> p1.getCost() - p2.getCost());
        for(Product p : products)
            System.out.println(p);
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        Product mostExpProduct = null;
        for (Product product : products){
            if (mostExpProduct == null || product.getCost() > mostExpProduct.getCost()){
                mostExpProduct = product;
            }
        }
        return mostExpProduct;
    }
}