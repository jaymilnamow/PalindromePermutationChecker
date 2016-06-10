package io.michaelcarroll;

import java.util.HashMap;

public class Alphabet {

    public HashMap<Character, Integer> alphabet;

    public Alphabet() {
        alphabet = new HashMap<>();
        alphabet.put('a', 0);
        alphabet.put('b', 0);
        alphabet.put('c', 0);
        alphabet.put('d', 0);
        alphabet.put('e', 0);
        alphabet.put('f', 0);
        alphabet.put('g', 0);
        alphabet.put('h', 0);
        alphabet.put('i', 0);
        alphabet.put('j', 0);
        alphabet.put('k', 0);
        alphabet.put('l', 0);
        alphabet.put('m', 0);
        alphabet.put('n', 0);
        alphabet.put('o', 0);
        alphabet.put('p', 0);
        alphabet.put('q', 0);
        alphabet.put('r', 0);
        alphabet.put('s', 0);
        alphabet.put('t', 0);
        alphabet.put('u', 0);
        alphabet.put('v', 0);
        alphabet.put('w', 0);
        alphabet.put('x', 0);
        alphabet.put('y', 0);
        alphabet.put('z', 0);
    }

    public void incrementCharacterOccurrence(char character) {
        alphabet.put(character, alphabet.get(character) + 1);
    }

    public HashMap<Character, Integer> getAlphabet(){
        return alphabet;
    }

}
