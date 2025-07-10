package OOP.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {
    private AnimalList list;

    @BeforeEach
    public void setUp() {
        list = new AnimalList();
    }

    @Test
    public void testAddSingleAnimal() {
        Animal a = new Animal("Dog", 3);
        list.add(a);

        assertNotNull(list.getHead());  // head ist nicht null
        assertEquals(a, list.getHead().getValue());  // head enthält das richtige Animal
        assertNull(list.getHead().getNext());  // keine weiteren Elemente
    }

    @Test
    public void testAddMultipleAnimals() {
        Animal a1 = new Animal("Dog", 3);
        Animal a2 = new Animal("Cat", 2);
        Animal a3 = new Animal("Bird", 1);

        list.add(a1);
        list.add(a2);
        list.add(a3);

        // Prüfe Reihenfolge: Dog -> Cat -> Bird
        assertEquals(a1, list.getHead().getValue());
        assertEquals(a2, list.getHead().getNext().getValue());
        assertEquals(a3, list.getHead().getNext().getNext().getValue());
        assertNull(list.getHead().getNext().getNext().getNext());
    }

    @Test
    public void testRemoveFromEmptyList() {
        list.remove(new Animal("Dog", 4));
        assertNull(list.getHead());
    }

    @Test
    public void testRemoveHeadOnly() {
        Animal dog = new Animal("Dog", 1);
        list.add(dog);
        list.remove(dog);
        assertNull(list.getHead());  // Liste sollte leer sein
    }

    @Test
    public void testRemoveHeadMultipleMatches() {
        Animal dog = new Animal("Dog", 1);
        Animal cat = new Animal("Cat", 1);

        // Liste: Dog -> Dog -> Cat
        list.add(dog);
        list.add(dog);
        list.add(cat);

        list.remove(dog);

        // Jetzt sollte nur noch Cat übrig sein als Kopf
        assertNotNull(list.getHead());
        assertEquals(cat, list.getHead().getValue());
        assertNull(list.getHead().getNext());
    }

    @Test
    public void testRemoveMiddleAndTail() {
        Animal dog = new Animal("Dog", 2);
        Animal cat = new Animal("Cat", 1);
        Animal bird = new Animal("Bird", 3);

        // Liste: Dog -> Cat -> Bird
        list.add(dog);
        list.add(cat);
        list.add(bird);

        list.remove(cat);

        // Liste sollte nun Dog -> Bird sein
        assertEquals(dog, list.getHead().getValue());
        assertEquals(bird, list.getHead().getNext().getValue());
        assertNull(list.getHead().getNext().getNext());

        // Jetzt entfernen wir Bird (Tail)
        list.remove(bird);
        assertEquals(dog, list.getHead().getValue());
        assertNull(list.getHead().getNext());
    }

    @Test
    public void testRemoveNonExistent() {
        Animal dog = new Animal("Dog", 3);
        Animal cat = new Animal("Cat", 2);

        list.add(dog);
        list.remove(cat);  // Cat ist nicht in der Liste

        // Liste bleibt unverändert
        assertEquals(dog, list.getHead().getValue());
        assertNull(list.getHead().getNext());
    }
}