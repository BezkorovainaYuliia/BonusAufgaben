package BacisJavaNovice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        System.out.println("Wie ist dein Name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            myName(name);
        }
        //
        System.out.println("Waelen Sie das Zahl:");
        int nummer = sc.nextInt();
        System.out.println("Das Zahl " + nummer + " is grosser als 0 " + isMehrAls0(nummer));
        //
        System.out.println("Waelen Sie das Zahl:");
        double dNummer = sc.nextDouble();
        System.out.println(square(dNummer));
        //
        System.out.println("Wie ist dein Name?");
        name = sc.next();
        System.out.println("Hallodrio, " + name);
    }

    public static void myName(String name){
        System.out.println(name);
    }

    public static boolean isMehrAls0(int nummer){
        return nummer > 0;
    }

    public static double square(double nummer){
        return Math.pow(nummer, 2);
    }
}
