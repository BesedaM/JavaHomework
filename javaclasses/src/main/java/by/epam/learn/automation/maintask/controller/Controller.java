package by.epam.learn.automation.maintask.controller;

import by.epam.learn.automation.maintask.entity.Basket;
import by.epam.learn.automation.maintask.entity.Product;
import by.epam.learn.automation.maintask.exception.ProjectException;
import by.epam.learn.automation.maintask.logic.ProductsFinder;
import by.epam.learn.automation.maintask.util.entitycreator.BasketFiller;
import by.epam.learn.automation.maintask.util.userinteraction.ConsolePrinter;
import by.epam.learn.automation.maintask.util.userinteraction.ConsoleReader;

import java.util.Arrays;
import java.util.List;

/**
 * @author BesedaM
 * @version 1.0
 */
public class Controller {

    public static void main(String[] args) {
        ConsolePrinter.printTextLine("Enter your basket size: ");
        int basketSize = ConsoleReader.readInt();
        ConsolePrinter.printTextLine("Creating a basket...");
        try {
            Basket basket = Basket.createBasket(basketSize);
            ConsolePrinter.printTextLine("Filling the basket with products...");
            BasketFiller.fillBasket(basket);
            ConsolePrinter.printTextLine(basket.toString());
            ConsolePrinter.printTextLine("Let's find CHIPS in the basket: ");
            List<Product> chips = ProductsFinder.findProductsByName(basket, "chips");
            ConsolePrinter.printTextLine("Found " + chips.size() + " products");
            ConsolePrinter.printTextLine(Arrays.toString(chips.toArray()));
            ConsolePrinter.printTextLine("Let's find MEAT in the basket: ");
            List<Product> meat = ProductsFinder.findProductsByName(basket, "meat");
            ConsolePrinter.printTextLine("Found " + meat.size() + " products");
            ConsolePrinter.printTextLine(Arrays.toString(meat.toArray()));
            ConsolePrinter.printTextLine("Let's find MILK in the basket with price lower or equal to 20: ");
            List<Product> milk = ProductsFinder.findProductsByNameWithPriceLowerEqual(basket, "milk", 20);
            ConsolePrinter.printTextLine("Found " + milk.size() + " products");
            ConsolePrinter.printTextLine(Arrays.toString(milk.toArray()));
            ConsolePrinter.printTextLine("Let's find products in the basket with shelf life bigger than 20 days: ");
            List<Product> betterSavings = ProductsFinder.findProductsWithShelfLifeBigger(basket, 20);
            ConsolePrinter.printTextLine(Arrays.toString(betterSavings.toArray()));

        } catch (ProjectException e) {
            e.printStackTrace();
        }

    }
}
