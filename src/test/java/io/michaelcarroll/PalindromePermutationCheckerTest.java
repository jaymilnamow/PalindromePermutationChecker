package io.michaelcarroll;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationCheckerTest {

    @Test
    public void hasPalindromePermutationTestWithFourAsAndOneB() throws Exception {
        Alphabet alphabet = new Alphabet();
        alphabet.incrementCharacterOccurrence('a');
        alphabet.incrementCharacterOccurrence('a');
        alphabet.incrementCharacterOccurrence('b');
        alphabet.incrementCharacterOccurrence('a');
        alphabet.incrementCharacterOccurrence('a');
        Assert.assertTrue( PalindromePermutationChecker.hasPalindromePermutation(alphabet.getAlphabet()));
    }

    @Test
    public void hasPalindromePermutationTestWithZsAndFs() throws Exception {
        Alphabet alphabet = new Alphabet();
        alphabet.incrementCharacterOccurrence('z');
        alphabet.incrementCharacterOccurrence('z');
        alphabet.incrementCharacterOccurrence('a');
        alphabet.incrementCharacterOccurrence('f');
        alphabet.incrementCharacterOccurrence('f');
        Assert.assertTrue( PalindromePermutationChecker.hasPalindromePermutation(alphabet.getAlphabet()));
    }

}