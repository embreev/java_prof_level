package homework8.test;

import java.util.HashMap;
import java.util.Map;

public class App {
    static String inputData = "5 1 5 2 2 4 1 4 5 1 5 3 2 4 4 4 5 1 3 4 2 2 1 2 4 4 4 5 4 3 5 4 4 5 5 1 4 1 5 3 1 4 5 3 3 4 2 2 4 4 5 5 1 1 1 4 5 5 \n" +
            "4 4 2 4 3 1 3 3 1 1 3 1 3 4 4 3 2 2 1 3 4 4 2 3 4 2 4 4 1 4 4 4 2 1 2 4 1 5 2 2 5 4 2 2 3 1 5 5 3 5 3 1 4 5 4 2 1 3\n" +
            " 1 2 1 4 1 3 4 2 2 5 2 3 1 1 2 3 3 4 4 2 4 1 2 2 2 5 1 5 1 2 2 1 3 3 4 3 5 3 5 1 2 1 3 3 2 4 1 4 3 5 1 2 1 2 3 2 1 3\n" +
            " 2 2 4 3 2 1 5 1 4 5 4 4 5 5 4 2 3 5 1 3 4 3 2 4 5 2 5 2 4 1 4 5 2 3 3 4 4 3 5 2 2 3 5 1 2 4 3 4 4 3 2 2 1 4 5 5 1 5\n" +
            " 2 4 5 5 4 2 2 1 5 1 3 4 2 4 2 2 4 3 5 2 2 4 4 4 5 5 2 5 5 2 5 1 1 5 5 4 1 2 4 1 2 2 5 4 5 1 5 4 4 5 5 5 3 3 4 3 3 5\n" +
            " 3 2 2 2 2 2 1 2 5 2 3 4 3 5 5 2 4 5 3 4 3 1 3 2 1 1 5 4 4 2 3 1 3 4 2 4 1 3 5 1 5 3 5 2 3 4 4 1 3 1 5 5 1 2 2 1 3 1 \n" +
            " 5 1 2 2 1 5 1 3 3 2 1 3 2 5 1 1 2 3 5 5 4 3 1 3 3 1 5 4 2 3 4";

    static char [] chars = inputData.replaceAll("\\s+", "").toCharArray();
    static Map<Character, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        for (char c: chars) {
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }
        }
        System.out.println(hm);
    }
}