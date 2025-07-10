package OOP.LinkedList;

public class AnimalList {
    private AnimalListItem head;

    public AnimalListItem getHead() {
        return head;
    }

    public void add(Animal value) {
        if (head == null) {
            head = new AnimalListItem(value);
        } else {
            AnimalListItem current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new AnimalListItem(value));
        }

    }
        public void remove(Animal value){
            if (head == null) {
                return;
            }

            while (head != null && head.getValue().equals(value)) {
                head = head.getNext();
            }

            AnimalListItem current = head;

            while (current != null && current.getNext() != null) {
                if (current.getNext().getValue().equals(value)) {
                    current.setNext(current.getNext().getNext());
                } else {
                    current = current.getNext();
                }
            }
        }

        public void print() {
        AnimalListItem current = head;
            while (current != null) {
                System.out.print(current);
                current = current.getNext();
                if (current != null) {
                    System.out.print(" -> ");
                }
            }
        }

    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        list.add(new Animal("Cat", 2));
        list.add(new Animal("Dog", 3));
        list.add(new Animal("Mouse", 4));
        list.add(new Animal("Cat", 2));
        list.add(new Animal("Dog", 4));
        list.add(new Animal("Mouse", 4));

        list.print();

        list.remove(new Animal("Dog", 3));
        System.out.println();
        list.print();
    }
}

