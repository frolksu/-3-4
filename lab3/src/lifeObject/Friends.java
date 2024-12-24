package lifeObject;

import enums.EatType;
import enums.GoType;
import enums.PlaceType;
import enums.TimeType;
import exceptions.PurchaseException;
import interfaces.HomeDoable;
import interfaces.Readable;
import interfaces.Placeable;
import scenceObject.Things;

public class Friends extends Aive implements HomeDoable, Placeable, Readable {
    public Friends(String name) {
        super(name);
    }

    public void GetUp(TimeType q){
        System.out.printf("Проснувшись %s", q);
    }
    public void Breakfast(EatType e){
        System.out.printf(" %s позавтракали %s", this, e);
    }
    public void DoWhy(){
        System.out.print("чтоб хоть немножечко проветрить мозги после бессонной ночи\n");
    }

    public void GoTo(PlaceType p){
        System.out.printf("Выйдя %s", p);
    }
    public void GoTo(PlaceType p, GoType g){
        System.out.printf(" и решили пойти %s %s,\n", p, g);
    }
    public void See(PlaceType p, Aive s){
        System.out.printf(" %s увидели %s %s", this, p, s);
    }

    public void Buy(int money, Things s) throws PurchaseException {
        if (money < 2) {
            throw new PurchaseException();
        }
        System.out.printf("Купив за два сантика %s ", s);
    }

    public void Search(Things s){
        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                System.out.printf("Только просмотрев газету вторично, %s наткнулись на небольшую заметку.", this);
            }

            else {
                System.out.printf("%s принялись искать %s ", this, s);
                System.out.print("но в газете ничего об этом не говорилось.\n");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
