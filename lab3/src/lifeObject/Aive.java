package lifeObject;

import java.util.Objects;

public abstract class Aive{
    private String Name;
    public Aive(String name){
        this.Name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aive aive = (Aive) o;
        return Objects.equals(Name, aive.Name);
    }

    public int hashCode() {
        return this.Name.hashCode();
    }

    public String toString(){
        return this.Name;
    }
}
