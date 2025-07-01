package BasicJavaIntermediate;

public class Intermediate {
    public static String getNummer(int  nummer) {
        String [] arrayNummers = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
         return arrayNummers[nummer - 1];
    }

    public static void main(String[] args) {
        makeArray100_3_5();
    }
    public static void makeArray100_3_5(){
        String[] array100 = new String[100];
        int counter = 1;
        for(int i = 0; i < 100; i++){
            if (counter % 3 == 0 && counter % 5 == 0){
                array100[i] = "#$";
            } else if (counter % 3 == 0){
                array100[i] = "#";
            } else if(counter % 5 == 0) {
                array100[i] = "$";
            } else {
                array100[i] = "" + counter;
            }
            System.out.print(array100[i] + "\t");
            counter++;
        }

    }
}
