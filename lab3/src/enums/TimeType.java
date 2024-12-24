package enums;

public enum TimeType {
    EARLY("раньше обычного,"),
    LATE("позже обычного,"),
    NORMAL("");
    private String val;
    TimeType(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}