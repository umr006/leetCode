package RomanToInt;

import java.util.HashMap;

public class Main {

    public static int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char curr;
        char next;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            curr = arr[i];

            if (i !=(arr.length - 1)) {
                next = arr[i + 1];
                if (map.get(curr) < map.get(next)) {
                    res += map.get(next) - map.get(curr);
                    i += 1;
                }
            }
            res += map.get(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        String roman = "VVI";
        System.out.println(romanToInt(roman));
    }
}
