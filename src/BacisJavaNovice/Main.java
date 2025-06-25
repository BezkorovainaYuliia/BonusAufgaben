package BacisJavaNovice;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            myName();
        }
        int nummer = -1;
        System.out.println("Das Zahl " + nummer + " is grosser als 0 " + isMehrAls0(nummer));
    }

    public static void myName(){
        System.out.println("Yuliia Bezkorovaina");
    }

    public static boolean isMehrAls0(int nummer){
        return nummer > 0 ? true : false;
    }
}
