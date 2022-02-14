package algo;

// O(n) time, O(1) space

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharacter(String str){
        HashMap<Character, Integer> characterFrequencies = new HashMap<>();
        for (int i = 0; i<str.length(); i++){
            char character = str.charAt(i);
            characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) +1);
        }
        for (int i = 0; i< str.length(); i++){
            char character = str.charAt(i);
            if (characterFrequencies.get(character) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("acbdcaf"));
    }
}
