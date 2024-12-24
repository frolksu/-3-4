package enums;

public enum GoType {
    FOOT("пешком"),
    CAR("на машине"),
    NONE("");
    private String val;
    GoType(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}
