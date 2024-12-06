package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordEndsWithR() {
        int words = new CountLetters().count("cat|car");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void wordWithSymbolEndsWithR() {
        int words = new CountLetters().count("car!|dog");
        Assertions.assertEquals(1, words);
    }
}