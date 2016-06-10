package io.michaelcarroll;


import java.util.HashMap;

public class PalindromePermutationChecker {

    public static boolean hasPalindromePermutation(HashMap<Character, Integer> alphabet) {
        int numberOfOdds = 0;
        for (Integer value : alphabet.values()) {
            if (value % 2 != 0)
                numberOfOdds++;
        }
        return numberOfOdds <= 1;
    }
}
