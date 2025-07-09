package OOP.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String weiter;
        do {
            System.out.println("Choose a car or bicycle");
            String vehicleName = input.nextLine();

            Vehicle vehicle = new Car();
            if (vehicleName.equalsIgnoreCase("bicycle")) {
                vehicle = new Bicycle();
            } else if (vehicleName.equalsIgnoreCase("car")) {
                vehicle = new Car();
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Choose action: accelerate or brake");
            String action = input.nextLine();
            if (action.equalsIgnoreCase("accelerate")) {
                System.out.println("Choose velocity: ");
                int velocity = input.nextInt();
                vehicle.accelerate(velocity);
            } else if (action.equalsIgnoreCase("brake")) {
                vehicle.brake();
            }
            System.out.println("Weiter ?");
            weiter = input.nextLine();
        }
        while (weiter.equals("weiter"));

    }
}
