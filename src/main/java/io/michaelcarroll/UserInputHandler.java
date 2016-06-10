package io.michaelcarroll;


import java.util.HashMap;
import java.util.Scanner;

public class UserInputHandler {

    Scanner scanner = new Scanner(System.in);
    Alphabet alphabet = new Alphabet();
    HashMap<Boolean, String> response;

    public UserInputHandler() {
        response = new HashMap<>();
        response.put(true, "YES");
        response.put(false, "NO");
    }

    public void runChecker() {
        String input = promptUser();
        if(input.matches("[a-z]+")) {
            for (int i = 0; i < input.length(); i++) {
                alphabet.incrementCharacterOccurrence(input.charAt(i));
            }
            Display.printMessage(response.get(PalindromePermutationChecker.hasPalindromePermutation(alphabet.getAlphabet())));
        }else
            Display.printMessage("Not a valid input");
    }

    public String promptUser() {
        Display.printMessage("Enter a string of lower case letters to check if a palindrome is present: ");
        return getUserInput();
    }

    private String getUserInput() {
        return scanner.next();
    }

}

