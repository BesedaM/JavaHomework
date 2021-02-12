package by.epam.learn.automation.maintask.util.entitycreator;

import by.epam.learn.automation.maintask.entity.Basket;
import by.epam.learn.automation.maintask.exception.NotEnoughSpaceException;

import static by.epam.learn.automation.maintask.util.entitycreator.ProductsContainerOptions.BASKET_FILLING_COEFF;

/**
 * Created to fill the Product container with Product objects
 */
public class BasketFiller {

    public static void fillBasket(Basket basket) throws NotEnoughSpaceException {
        if (basket != null) {
            int numberOfProducts = (int) (basket.getBasketSize() * BASKET_FILLING_COEFF);
            for (int i = 0; i < numberOfProducts; i++) {
                basket.addProduct(ProductCreator.createProduct());
            }
        }
    }

}
