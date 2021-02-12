package by.epam.learn.automation.maintask.util.entitycreator;


import static by.epam.learn.automation.maintask.util.entitycreator.ProductsContainerOptions.*;

/**
 * Auxiliary class created to provide ProductCreator class with some valid information about products,
 * such as shelf life and producer
 */
public enum ProductType {
    MILK(14, MILK_PRODUCER),
    BREAD(2, BREAD_PRODUCER),
    EGGS(25, EGGS_PRODUCER),
    CHEESE(30, CHEESE_PRODUCER),
    FISH(3, FISH_PRODUCER),
    MEAT(2, MEAT_PRODUCER),
    CHIPS(180, CHIPS_PRODUCER),
    SPICES(700, SPICES_PRODUCER);

    private int shelfLife;
    private String producer;


    ProductType(int shelfLife, String producer) {
        this.shelfLife = shelfLife;
        this.producer = producer;
    }

    public int getShelfLife() {
        return this.shelfLife;
    }

    public String getProducer() {
        return this.producer;
    }


}
