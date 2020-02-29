package testdome.unique_name;

import java.util.HashMap;
import java.util.Map;

public class UniqueName {
    public static String firstUniqueName(String[] names) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String name : names) {
            hashMap.putIfAbsent(name, 0);
            hashMap.computeIfPresent(name, (key, oldValue) -> oldValue + 1);
        }

        for (String name : names) {
            if (hashMap.get(name) == 1) {
                return name;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] {"Andy", "Josh", "Andy", "Ollie"}));
    }
}
