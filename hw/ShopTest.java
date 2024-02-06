package seminars.first.hw;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    Shop myShop = new Shop();
    assertThat(myShop.getProducts().size()).isEqualTo(0); // empty List

    Product product1 = new Product("Chips Lays", 120);
    myShop.addProduct(product1);
    assertThat(myShop.getProducts().size()).isEqualTo(1); // correct size

    Product product2 = new Product("Coca-Cola", 100);
    myShop.addProduct(product2);
    assertThat(myShop.getProducts().size()).isEqualTo(2); // correct size

    Product product3 = new Product("Orange Juice", 150);
    myShop.addProduct(product3);
    assertThat(myShop.getProducts().size()).isEqualTo(3); // correct size

    assertThat(product1.toString()).isEqualTo(myShop.getProducts().get(0).toString()); // Correct list
    assertThat(product2.toString()).isEqualTo(myShop.getProducts().get(1).toString()); // Correct list
    assertThat(product3.toString()).isEqualTo(myShop.getProducts().get(2).toString()); // Correct list

    myShop.getSortedListProducts();

    List<Product> expectedProducts = Arrays.asList(
            new Product("Coca-Cola", 100),
            new Product("Chips Lays", 120),
            new Product("Orange Juice", 150)
    );
    assertThat(expectedProducts.toString()).isEqualTo(myShop.getProducts().toString()); // correct work of method SortedListProducts

    Product mostExpensiveProduct = myShop.getMostExpensiveProduct();
    assertThat(product3).toString().equals(mostExpensiveProduct.toString()); // correct work of method getMostExpensiveProduct
    }
}




