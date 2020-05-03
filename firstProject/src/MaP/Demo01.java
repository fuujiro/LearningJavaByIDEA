package MaP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            if (hs.containsKey(line.charAt(i))) {
                Integer in = hs.get(line.charAt(i));
                in++;
                hs.put(line.charAt(i), in);
            } else {
                hs.put(line.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = hs.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
