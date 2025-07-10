package OOP.LinkedList;

public class AnimalListItem {
    private final Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public Animal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  value.toString();
    }
}
