package exceptions;

public class NoSellerException extends RuntimeException {
    public NoSellerException() {
      super("\nА продавца та и нет!!! Друзья попали в параллельную ветку");
    }
}
