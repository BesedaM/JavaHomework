package by.epam.learn.automation.maintask.model.exception;

public class NotEnoughSpaceOnDiskException extends ProjectException {

    public NotEnoughSpaceOnDiskException() {
        super("Impossible to add a new audio. Not enough space on disk...");
    }

    public NotEnoughSpaceOnDiskException(String message) {
        super(message);
    }
}
