package OOP.Fahrzeuginspektion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
@ParameterizedTest
    @CsvSource({"4, true",
    "3, false",
    "2, false"})
    void isCarHas4Reifen_AllwaysTrue(int numbersOfTires, boolean answer) {
    CarInspectionService service = new CarInspectionService();
    Car car = new Car();
    car.setNumberOfTires(numbersOfTires);
    boolean isTires4Numbers = service.isTires4(car);
    assertEquals(answer, isTires4Numbers);
}
}