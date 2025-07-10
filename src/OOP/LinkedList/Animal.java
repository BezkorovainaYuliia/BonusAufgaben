package OOP.LinkedList;

public record Animal(String name, int age) {


    @Override
    public String toString() {
        return name + "  " + age;
    }
}
