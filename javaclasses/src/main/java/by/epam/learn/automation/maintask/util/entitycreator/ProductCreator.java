package by.epam.learn.automation.maintask.util.entitycreator;

import by.epam.learn.automation.maintask.entity.Product;

import java.util.Random;

import static by.epam.learn.automation.maintask.util.entitycreator.ProductsContainerOptions.*;

/**
 * Class was created to generate some random data for filling Product container
 */
public class ProductCreator {

    private static Random generator = new Random();
    private static ProductType[] products = ProductType.values();

    public static Product createProduct() {
        Product product = new Product();
        product.setUPC(UPC_BEGINNING_BELARUS + generator.nextInt(Integer.MAX_VALUE));
        ProductType type = products[generator.nextInt(products.length)];
        product.setName(type.name().toLowerCase());
        product.setProducer(type.getProducer());
        product.setShelfLife(type.getShelfLife());
        product.setNumber((byte) (MIN_NUMBER_OF_SAME_PRODUCTS
                + generator.nextInt(MAX_NUMBER_OF_SAME_PRODUCTS - MIN_NUMBER_OF_SAME_PRODUCTS)));
        product.setPrice(MIN_PRODUCT_PRICE + generator.nextInt(MAX_PRODUCT_PRICE - MIN_PRODUCT_PRICE));
        return product;
    }
}
