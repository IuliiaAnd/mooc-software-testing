package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsPractice{
    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    public int convertString(String romanNumeral){

        int convertedNum = 0;

        for(int i=0; i < romanNumeral.length(); i++){
            char currentChar = romanNumeral.charAt(i);
            // Check if the current character is a valid Roman numeral
            if (!map.containsKey(currentChar)) {
                throw new IllegalArgumentException("Invalid Roman numeral: " + currentChar);
            }
            int currentNum = map.get(currentChar);
            int nextNum;
            if (i+1<romanNumeral.length()){
                nextNum = map.get(romanNumeral.charAt(i+1));
            } else {
                nextNum = 0;
            }

            if(currentNum >= nextNum){
                convertedNum += currentNum;
            } else {
                convertedNum -= currentNum;
            }
        }

        return convertedNum;
    }
}
