import java.util.HashMap;
import java.util.Map;

public class Main {
    static String lorem= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
            " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
            "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
            "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
            "qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> listSymb = new HashMap<>();
        for (int i = 0; i < lorem.length(); i++) {
            char symbol = lorem.charAt(i);

            if (listSymb.get(symbol) == null) {
                int repeat = 1;
                listSymb.put(symbol, repeat);
            } else {
                int repeat = listSymb.get(symbol);
                repeat++;
                listSymb.put(symbol, repeat);
            }
        }
        int repeatMax = -1;
        char keyMax = 0;
        for (char key : listSymb.keySet()) {
            int repeats = listSymb.get(key);
            if (repeats > repeatMax) {
                keyMax = key;
                repeatMax = repeats;
            }
        }
        int repeatMin = Integer.MAX_VALUE;
        char keyMin = 0;
        for (char key2 : listSymb.keySet()) {
            int repeats = listSymb.get(key2);
            if (repeats < repeatMin) {
                keyMin = key2;
                repeatMin = repeats;
            }
        }
        System.out.println(listSymb.entrySet());
        System.out.println("Количество максимального повтора символа '" + keyMax + "' составляет " + repeatMax);
        System.out.println("Количество минимального повтора символа '" + keyMin + "' составляет " + repeatMin);
    }
}

