package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTest {

    @Test
    public void incrementCharacterOccurrence() throws Exception {
        Alphabet alphabet = new Alphabet();
        int expectedValue = 2;
        alphabet.incrementCharacterOccurrence('a');
        alphabet.incrementCharacterOccurrence('a');
        int actualValue = alphabet.alphabet.get('a');
        assertEquals(expectedValue, actualValue);
    }



}