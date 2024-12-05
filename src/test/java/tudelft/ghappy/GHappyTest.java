package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class GHappyTest {
    @ParameterizedTest(name = "{0}: input={1}, expected={2}")
    @CsvSource({
            //g is happy
            "g-happy-middle, xxggxx, true","g-happy-start, ggxxxx, true","g-happy-end, xxxxgg, true",
            //g not happy
            "g-not-happy-middle, xxgxx, false", "g-not-happy-start, gxxxx, false","g-not-happy-end, xxxxg, false",
            //only g string
            "triple g, ggg, true", "double g, gg, true", "single g, g, false",
            //g not happy space between
            "g-not-happy-space, gxgxg, false",
    })
    public void gIsHappy(String partition, String str, boolean expectedResult){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
