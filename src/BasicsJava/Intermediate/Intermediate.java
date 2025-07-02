package BasicsJava.Intermediate;

import java.util.Scanner;

public class Intermediate {
    public static String getNummer(int nummer) {
        String[] arrayNummers = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        return arrayNummers[nummer - 1];
    }

    public static void main(String[] args) {
        makeArray100_3_5();
        String[] str = listUsers();
        for (String s : str) {
            if (s == null) break;
            System.out.print(s + "\t");
        }
    }

    public static void makeArray100_3_5() {
        String[] array100 = new String[100];
        int counter = 1;
        for (int i = 0; i < 100; i++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                array100[i] = "#$";
            } else if (counter % 3 == 0) {
                array100[i] = "#";
            } else if (counter % 5 == 0) {
                array100[i] = "$";
            } else {
                array100[i] = "" + counter;
            }
            System.out.print(array100[i] + "\t");
            counter++;
        }

    }

    public static String[] listUsers() {
        String[] listUsers = new String[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String antwort;
        do {
            System.out.println("Dein Name ist ");
            listUsers[counter] = scanner.nextLine();
            counter++;
            System.out.println("Weiter ?");
            antwort = scanner.nextLine();
        } while (antwort.equals("ja") && counter < 10);
        return listUsers;
    }
}
