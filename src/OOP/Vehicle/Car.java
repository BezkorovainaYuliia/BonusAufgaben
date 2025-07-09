package OOP.Vehicle;

public class Car extends Vehicle{

    @Override
    public int accelerate(int kmh) {
        int actualVelocity = super.getVelocity() + kmh;
        super.setVelocity(actualVelocity);
        System.out.println("Car accelerated");
        System.out.println("The acceleration is: " + actualVelocity);
        return actualVelocity;
    }
}
