package OOP.Fahrzeuginspektion;

import java.util.Objects;

public class Car {
    private int numberOfTires;
    private int numbersOfDoors;
    private boolean seatBelt;
    private boolean airbag;

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTires == car.numberOfTires && numbersOfDoors == car.numbersOfDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numbersOfDoors, seatBelt, airbag);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numbersOfDoors=" + numbersOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }

     Car(){
        this.numberOfTires = 0;
        this.numbersOfDoors = 0;
        this.seatBelt = false;
        this.airbag = false;
     }

     Car(int numberOfTires, int numbersOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numbersOfDoors = numbersOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
     }
}
