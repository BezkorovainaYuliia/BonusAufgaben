package OOP.Vehicle;

public abstract class Vehicle implements Accelerateable {
    private int velocity;

    public int accelerate(int kmh){
        velocity += kmh;
        return 0;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void brake() {
        velocity = 0;
        System.out.println("Brake " + getClass());
    }
}
