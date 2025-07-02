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
}
