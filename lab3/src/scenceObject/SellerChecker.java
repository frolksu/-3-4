package scenceObject;

import static java.lang.Math.random;
import exceptions.NoSellerException;

public class SellerChecker {
    public void checkSellerAvailability() {
        int n = (int) (random() * 10);
        if (n < 3) {
            throw new NoSellerException();
        } else {
            System.out.println("Свежая пресса!");
        }
    }

}

