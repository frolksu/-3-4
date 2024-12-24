package scenceObject;

import java.util.Objects;

public abstract class Things {
    private String Name;
    public Things(String name){
        this.Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Things something = (Things) o;
        return Objects.equals(Name, something.Name);
    }

    public int hashCode() {
        return this.Name.hashCode();
    }
    public String toString(){
        return this.Name;
    }
}
