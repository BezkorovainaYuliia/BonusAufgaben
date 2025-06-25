package BacisJavaNovice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        for (int i = 0; i < 5; i++) {
            myName();
        }
        //
        int nummer = -1;
        System.out.println("Das Zahl " + nummer + " is grosser als 0 " + isMehrAls0(nummer));
        //
        double dNummer = 3.1;
        System.out.println(square(dNummer));
        //
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hallodrio, " + name);
    }

    public static void myName(){
        System.out.println("Yuliia Bezkorovaina");
    }

    public static boolean isMehrAls0(int nummer){
        return nummer > 0;
    }

    public static double square(double nummer){
        return Math.pow(nummer, 2);
    }
}
