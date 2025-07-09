package OOP.Vehicle;

public class Bicycle extends Vehicle {

    @Override
    public int accelerate(int kmh) {
        int actualVelocity = super.getVelocity();
        if (actualVelocity + kmh > 35) {
            System.out.println();
            System.err.println("Velocity is too high");
            return super.accelerate(kmh);
        } else{
            actualVelocity = actualVelocity + kmh;
            System.out.println("Velocity is " + actualVelocity);
        }
        super.setVelocity(actualVelocity);
        return super.getVelocity();
    }
}
