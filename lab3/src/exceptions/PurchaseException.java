package exceptions;

public class PurchaseException extends Exception {

    public PurchaseException() {
        super("Не получилось купить газету, сантиков недостаточно...");
    }
}

