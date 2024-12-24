package enums;

public enum SoundType {
    LOUND("громко"),
    QUIET("тихо"),
    NORMAL("");
    private String val;
    SoundType(String s){
        val = s;
    }
    public String toString(){
        return val;
    }
}