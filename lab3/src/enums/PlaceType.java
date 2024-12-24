package enums;

public enum PlaceType {
    OUTDOORS("на улицу,"),
    OFFICE("в контору"),
    CORNER("на углу");
    private String val;
    PlaceType(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}

