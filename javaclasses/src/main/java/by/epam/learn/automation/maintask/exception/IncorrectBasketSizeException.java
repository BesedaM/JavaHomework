package by.epam.learn.automation.maintask.exception;

public class IncorrectBasketSizeException extends ProjectException{

    public IncorrectBasketSizeException() {
        super("Basket size can't be negative");
    }

    public IncorrectBasketSizeException(String message) {
        super(message);
    }
}
