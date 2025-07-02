package OOP.Fahrzeuginspektion;

public class CarInspectionService {

    public boolean isTires4(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean isSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    public boolean isAirBag(Car car) {
        return car.isAirbag();
    }

    public boolean is3Oder5Dooers(Car car) {
        return car.getNumbersOfDoors() == 3 || car.getNumbersOfDoors() == 5;
    }

    public boolean checkCar(Car car) {
        return is3Oder5Dooers(car) && isSeatBelt(car) && isAirBag(car) && is3Oder5Dooers(car);
    }
}
