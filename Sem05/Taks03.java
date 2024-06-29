/*
Задание No3
Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
*/

import java.util.HashMap;
import java.util.Map;

public class Taks03 {
    public static void main(String[] args) {
        String romanNum = "MMXXIV";
        System.out.println(romanToArabic(romanNum));
    }

    public static Map<Character, Integer> romanToArabicMap() {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        return romanMap;
    }

    public static int romanToArabic(String romanNum) {
        Map<Character, Integer> romanMap = romanToArabicMap();
        int result = 0;
        int prevValue = 0;
        for (int i = romanNum.length() -1 ; i >= 0; i--) {
            int currentValue = romanMap.get(romanNum.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
