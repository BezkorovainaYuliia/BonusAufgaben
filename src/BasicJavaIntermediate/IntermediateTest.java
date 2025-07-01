package BasicJavaIntermediate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateTest {
    @ParameterizedTest
    @CsvSource({
            "2, zwei",
            "1, eins",
            "9, neun",
            "5, fünf"
    })
    void getNameVonZahl(int nummer, String nameNummer) {
        assertEquals(nameNummer, Intermediate.getNummer(nummer));
    }

}