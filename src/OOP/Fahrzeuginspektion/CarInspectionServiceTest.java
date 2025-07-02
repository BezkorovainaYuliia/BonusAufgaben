package OOP.Fahrzeuginspektion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @ParameterizedTest
    @CsvSource({"true, true",
            "false, false"})
    void isCarHasseatBelts_AllwaysTrue(boolean seatBelt, boolean answer) {
        CarInspectionService service = new CarInspectionService();
        Car car = new Car();
        car.setSeatBelt(seatBelt);
        boolean isSeatBelt = service.isSeatBelt(car);
        assertEquals(answer, isSeatBelt);
    }

    @ParameterizedTest
    @CsvSource({"true, true",
            "false, false"})
    void isCarHasAirBag_AllwaysTrue(boolean airBag, boolean answer) {
        CarInspectionService service = new CarInspectionService();
        Car car = new Car();
        car.setAirbag(airBag);
        boolean isAirBag = service.isAirBag(car);
        assertEquals(answer, isAirBag);
    }

    @ParameterizedTest
    @CsvSource({"3, true",
            "5, true",
            "2, false",
            "0, false"})
    void isCarHas3Oder5Doors(int numbersOfDoors, boolean answer) {
        CarInspectionService service = new CarInspectionService();
        Car car = new Car();
        car.setNumbersOfDoors(numbersOfDoors);
        boolean is3Oder5Doors = service.is3Oder5Dooers(car);
        assertEquals(answer, is3Oder5Doors);
    }

    @ParameterizedTest
    @CsvSource({"3, 4, true, true, true",
            "5, 4, true, true, true",
            "5, 4, false, true, false",
            "2, 3, true, false, false",
            "0, 0, false, false, false"})
    void isCarCool(int numbersOfDoors, int numbersOfTires, boolean airBag, boolean seatBelt, boolean answer) {
        CarInspectionService service = new CarInspectionService();
        Car car = new Car(numbersOfTires, numbersOfDoors, seatBelt, airBag);
        boolean checkCar = service.checkCar(car);
        assertEquals(answer, checkCar);
    }
}