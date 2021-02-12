package by.epam.learn.automation.maintask.exception;

public class NotEnoughSpaceException extends ProjectException {

    public NotEnoughSpaceException() {
        super("Not enough space in basket for product");
    }

    public NotEnoughSpaceException(String message) {
        super(message);
    }

}
