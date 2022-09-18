package org.ayu.string;


import java.util.HashMap;

public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str) {
        if (str.length() == 0) return -1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String k = str.substring(i, i + 1);
            int times = map.getOrDefault(k, 0);
            map.put(k, ++times);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.substring(i, i + 1)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hello = "hellohello!";
        System.out.println(new FirstNotRepeatingChar().firstNotRepeatingChar(hello));
    }
}
