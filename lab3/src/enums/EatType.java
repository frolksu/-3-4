package enums;

public enum EatType {
    BAD("без аппетита"),
    MUCH("много"),
    NORMAL("");
    private String val;
    EatType(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}

