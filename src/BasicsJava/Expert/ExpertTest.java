package BasicsJava.Expert;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpertTest {
    @Test
    public void andereRichtung() {
        String expected = "olleH";
        String actual = "Hello";
        assertEquals(expected, Expert.revers(actual));
    }

    @Test
    public void sorting() {
        int[] actual = {6, 2, 8, 3, 9, 6};
        int[] expected = {2, 3, 6, 6, 8, 9};
        assertArrayEquals(expected, Expert.sorting(actual));
    }

    @Test
    public void trim() {
        String actual = "hello";
        String[] expected = {"h", "e", "l", "l", "o"};
        assertArrayEquals(expected, Expert.trim(actual));
    }

    @Test
    public void testQuersumme() {
        int actual = Expert.Quersumme(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1, I",
            "100, C",
            "6, VI",
            "99, XCIX",
            "89, LXXXIX"})
    public void test(int digital, String expected) {
        String actual = Expert.getRomaDigital(digital);
        assertEquals(expected, actual);
    }

}