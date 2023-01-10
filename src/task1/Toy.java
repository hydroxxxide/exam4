package task1;

public class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return  " имя = '" + name + '\'' +
                ']';
    }
}
