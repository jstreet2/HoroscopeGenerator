package test;

import org.junit.Test;
import static com.company.FortuneTeller.horoscopeFortuneGenerator;
import static junit.framework.TestCase.assertEquals;

/**
 * Tests for FortuneTeller class to check all edge cases
 * Created by Jennifer on 2016-10-01.
 */
public class FortuneTellerTest {

    /**
     * Test that invalid month will not result in a fortune being told
     */
    @Test
    public void shouldNotAcceptInvalidMonth() {
        //GIVEN
        String month = "mecember";
        int day = 18;

        //WHEN
        String fortune = horoscopeFortuneGenerator(month, day);

        //THEN
        assertEquals(fortune, "Oops, try entering your actual birth date next time!");
    }

    /**
     * Test that invalid day will not be accepted
     */
    @Test
    public void shouldRequireBirthDateLessThanThirtyOne() {
        //GIVEN
        String month = "may";
        int day = 33;

        //WHEN
        String fortune = horoscopeFortuneGenerator(month, day);

        //THEN
        assertEquals(fortune, "Oops, try entering your actual birth date next time!");
    }

    @Test
    public void shouldRequireBirthDateGreaterThanZero() {
        //WHEN
        String month = "april";
        int day = 0;

        //WHEN
        String fortune = horoscopeFortuneGenerator(month, day);

        //THEN
        assertEquals(fortune, "Oops, try entering your actual birth date next time!");
    }

    /**
     * Test that no birth month will not be accepted
     */
    @Test
    public void shouldRequireBirthMonth() {
        //GIVEN
        String month = "";
        int day = 12;

        //WHEN
        String fortune = horoscopeFortuneGenerator(month, day);

        //THEN
        assertEquals(fortune, "Oops, try entering your actual birth date next time!");
    }
}