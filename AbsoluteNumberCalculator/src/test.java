import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class test {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result =Main.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = Main.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = Main.findAbsolute(number);
        assertEquals(expected, result);
    }
}