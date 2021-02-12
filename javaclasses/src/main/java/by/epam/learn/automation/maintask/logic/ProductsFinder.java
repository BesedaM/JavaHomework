package by.epam.learn.automation.maintask.logic;

import by.epam.learn.automation.maintask.entity.Basket;
import by.epam.learn.automation.maintask.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Class created to find Product objects by the given conditions
 */
public class ProductsFinder {

    /**
     * Finds Products in a Basket by Product name
     *
     * @param basket container with Product objects
     * @param productName   Product name
     * @return list of Products with the given name
     */
    public static List<Product> findProductsByName(Basket basket, String productName) {
        return findProductsByNameWithPriceLowerEqual(basket, productName, Integer.MAX_VALUE);
    }

    /**
     * Finds Products in a Basket by Product name and with price lower or equal than the given
     *
     * @param basket container with Product objects
     * @param productName   Product name
     * @param price  maximum inclusive value of price
     * @return list of Products with the given name and the price not bigger than the given
     */
    public static List<Product> findProductsByNameWithPriceLowerEqual(Basket basket, String productName, int price) {
        List<Product> list = new ArrayList<>();
        if (basket != null && productName != null && price > 0) {
            for (int i = 0; i < basket.getProductsAmount(); i++) {
                Product product = basket.getProduct(i);
                if (product.getName().equals(productName.toLowerCase())
                        && product.getPrice() <= price) {
                    list.add(basket.getProduct(i));
                }
            }
        }
        return list;
    }

    /**
     * Finds products in a Basket with a shelf life not bigger than the given
     *
     * @param basket    container with Product objects
     * @param shelfLife minimum exclusive value of product shelf life
     * @return list of Products with the shelf life bigger than the given
     */
    public static List<Product> findProductsWithShelfLifeBigger(Basket basket, int shelfLife) {
        List<Product> list = new ArrayList<>();
        if (basket != null && shelfLife > 0) {
            for (int i = 0; i < basket.getProductsAmount(); i++) {
                Product product = basket.getProduct(i);
                if (product.getShelfLife() > shelfLife) {
                    list.add(basket.getProduct(i));
                }
            }
        }
        return list;

    }

}
