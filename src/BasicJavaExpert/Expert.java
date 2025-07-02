package BasicJavaExpert;

public class Expert {

    public static void main(String[] args) {

    }
    public static String revers(String actual) {
        StringBuilder reversSting = new StringBuilder(actual);
        reversSting.reverse();
        return reversSting.toString();
    }

    public static int[] sorting(int[] actual) {

        for (int i = 0; i < actual.length - 1; i++) {
            for (int j = i + 1; j < actual.length; j++) {
                //int temp = actual[i] > actual[j] ? actual[i] : actual[j];
                if (actual[j] < actual[i]) {
                    int temp = actual[i];
                    actual[i] = actual[j];
                    actual[j] = temp;
                }
            }
        }
        return actual;
    }

    public static Object[] trim(String actual) {
        String[] array = new String[actual.length()];
        for (int i = 0; i < actual.length(); i++) {
            array[i] = String.valueOf(actual.charAt(i));
        }
        return array;
    }

    public static int Quersumme(int zahl) {
        int quersumme = 0;
        zahl = Math.abs(zahl);
        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl /= 10;
        }
        return quersumme;
    }

    public static String getRomaDigital(String digital) {

    }
}
