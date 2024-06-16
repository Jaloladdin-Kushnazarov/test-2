public class Climate {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Climate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
