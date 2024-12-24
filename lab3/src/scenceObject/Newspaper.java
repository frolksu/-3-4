package scenceObject;

public class Newspaper extends Things {
    public final Mesage mesage;
    public Newspaper(String name) {
        super(name);
        this.mesage = new Mesage("сообщение о крахе Общества гигантских растений");
    }

    public static class Mesage extends Things {
        public Mesage(String name){
            super(name);
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
