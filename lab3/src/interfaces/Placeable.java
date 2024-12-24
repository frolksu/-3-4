package interfaces;

import enums.PlaceType;
import lifeObject.Aive;

public interface Placeable {
    void GoTo(PlaceType p);
    void See(PlaceType p, Aive s);
}
