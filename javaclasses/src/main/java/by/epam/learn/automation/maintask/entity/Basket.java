package by.epam.learn.automation.maintask.entity;

import by.epam.learn.automation.maintask.exception.IncorrectBasketSizeException;
import by.epam.learn.automation.maintask.exception.NotEnoughSpaceException;

import java.util.Arrays;

/**
 * Container entity class for Product objects
 */
public class Basket {

    private Product[] products;
    private int productsAmount;

    private Basket() {
        products = new Product[10];
    }

    private Basket(int size) {
        products = new Product[size];
    }


    /**
     * Creates a basket of default size (10 products)
     *
     * @return Basket object
     */
    public static Basket createDefaultSizeBasket() {
        return new Basket();
    }

    /**
     * Creates basket of given size
     *
     * @param size given basket size value
     * @return Basket object of a given size
     */
    public static Basket createBasket(int size) throws IncorrectBasketSizeException {
        Basket basket;
        if (size < 1) {
            throw new IncorrectBasketSizeException();
        } else {
            basket = new Basket(size);
        }
        return basket;
    }

    public int getBasketSize() {
        return products.length;
    }

    public int getProductsAmount() {
        return this.productsAmount;
    }

    public int getFreeSpace() {
        return this.products.length - this.productsAmount;
    }

    public void addProduct(Product product) throws NotEnoughSpaceException {
        if (products.length > productsAmount) {
            this.products[this.productsAmount] = product;
            this.productsAmount++;
        } else {
            throw new NotEnoughSpaceException();
        }
    }

    public Product getProduct(int index) {
        Product product = null;
        if (index >= 0 && index < productsAmount) {
            product = products[index];
        }
        return product;
    }

    public boolean containsProduct(Product product) {
        boolean containsProduct = false;
        for (int i = 0; i < productsAmount; i++) {
            if (products[i].equals(product)) {
                containsProduct = true;
                break;
            }
        }
        return containsProduct;
    }

    /**
     * Method deletes the first occurrence of given product in the Basket
     *
     * @param product the product to delete
     */
    public void deleteProduct(Product product) {
        for (int i = 0; i < productsAmount; i++) {
            if (products[i].equals(product)) {
                for (int j = i; j < productsAmount - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[productsAmount - 1] = null;
                this.productsAmount--;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Total amount of products in the basket is " + productsAmount +
                ", and there is a place for " + this.getFreeSpace() + " more products." + System.lineSeparator() +
                "Products in the basket:" + System.lineSeparator() + Arrays.toString(products);
    }
}
