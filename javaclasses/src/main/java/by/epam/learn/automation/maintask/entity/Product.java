package by.epam.learn.automation.maintask.entity;

import java.util.Objects;

/**
 * Main entity class
 */
public class Product {
    private static int idCounter;

    private int id;
    private long UPC;
    private String name;
    private String producer;
    private int price;      //price is in some common units
    private int shelfLife;
    private byte number;

    {
        this.id = idCounter++;
    }


    public Product() {
    }

    public Product(long UPC, String name, String producer, int shelfLife) {
        this.UPC = UPC;
        this.name = name;
        this.producer = producer;
        this.shelfLife = shelfLife;
    }

    public Product(String name, int price, byte number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public Product(long UPC, String name, String producer, int price, int shelfLife, byte number) {
        this.UPC = UPC;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.number = number;
    }

    public Product(Product product) {
        this.UPC = product.getUPC();
        this.name = product.getName();
        this.producer = product.getProducer();
        this.price = product.getPrice();
        this.shelfLife = product.getShelfLife();
        this.number = product.getNumber();
    }


    public void setUPC(long UPC) {
        this.UPC = UPC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public long getUPC() {
        return UPC;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public byte getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return UPC == product.UPC &&
                Double.compare(product.price, price) == 0 &&
                shelfLife == product.shelfLife &&
                number == product.number &&
                name.equals(product.name) &&
                producer.equals(product.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UPC, name, producer, price, shelfLife, number);
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"id=" + id + ", UPC " + UPC + ", " + name.toUpperCase() +
                ", producer '" + producer +
                "', price is " + price + " units" +
                ", shelfLife is " + shelfLife +
                " days, number of products is " + number;
    }
}
