package BasicJavaExpert;

public class Expert {

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

    public static String getRomaDigital(int digital) {
        if (digital < 1 || digital > 100) {
            return "Ungültige Eingabe. Bitte eine Zahl zwischen 1 und 100 eingeben.";
        }

        String[] zehner = {
                "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"
        };

        String[] einer = {
                "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
        };

        return zehner[digital / 10] + einer[digital % 10];
    }

}
