package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "Message: {0}, Expected: {2} - Shift: {1}")
    @CsvSource({
            //valid cases
            "'abc', 3, 'def'",
            "'xyz', 3, 'abc'",
            //valid negative shift
            "'def', -3, 'abc'",
            //invalid upper case letters
            "'AbC', 3, 'invalid'",
            //invalid spacial characters
            "'abc!', 4, 'invalid'",
            //valid big shift
            "'abc', 29, 'def'"
    })
    public void testCaesarCipher(String message, int shift, String expectedResult){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
