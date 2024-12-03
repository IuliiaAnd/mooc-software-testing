package tudelft.roman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class RomanNumeralsPracticeTest {
    private  RomanNumeralsPractice roman;
    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeralsPractice();
    }
    @Test
    public void singleNumber() {
        int result = roman.convertString("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithSum() {
        int result = roman.convertString("VI");
        Assertions.assertEquals(6, result);
    }
    @Test
    public void numberWithSubtraction() {
        int result = roman.convertString("IX");
        Assertions.assertEquals(9, result);
    }
    @Test
    public void numberWithSumAndSubtraction() {
        int result = roman.convertString("XIV");
        Assertions.assertEquals(14, result);
    }
    @Test
    public void invalidNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            roman.convertString("Q");
        });
    }
    @Test
    public void numberWithManyDigits() {
        int result = roman.convertString("CCCXXV");
        Assertions.assertEquals(325, result);
    }
}
