import enums.*;
import exceptions.NoSellerException;
import exceptions.PurchaseException;
import lifeObject.Friends;
import lifeObject.Seller;
import scenceObject.Newspaper;
import records.LaterStory;
import scenceObject.SellerChecker;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args){
        int sum = (int) (random() * 10);
        Friends friends = new Friends("Незнайка и Козлик");
        Seller seller = new Seller("продавец");
        Newspaper newspaper = new Newspaper("газета");
        SellerChecker checker = new SellerChecker();
        LaterStory story = new LaterStory("...");
        friends.GetUp(TimeType.EARLY);
        friends.Breakfast(EatType.BAD);
        friends.GoTo(PlaceType.OFFICE, GoType.FOOT);
        friends.DoWhy();
        friends.GoTo(PlaceType.OUTDOORS);
        friends.See(PlaceType.CORNER, seller);
        seller.Shout(SoundType.LOUND);

        try {
            checker.checkSellerAvailability();
            
            try{
                friends.Buy(sum, newspaper);
            }catch (PurchaseException e){
                System.out.println(e.getMessage() + " Друзьям придется искать другой способ.");
            }
            friends.Search(newspaper.mesage);
            story.Display();
        } catch (NoSellerException e) {
            System.out.println(e.getMessage());
        }





    }
}

