import org.testng.annotations.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing Day 2,Month 1, Year 2018")
    public void testDay2month1year2018() {
        int x =1;
        int y =1;
        int day = 2;
        int newDay = Main.Day(x,y);
        assertEquals(newDay,day);
        int a = 1;
        int b = 0;
        int month = 1;
        int newMonth = Main.Month(a,b);
        assertEquals(month,newMonth);
        int c = 0;
        int d = 2018;
        int year = 2018;
        int newYear = Main.Year(c,d);
        assertEquals(year,newYear);
    }
    @Test
    @DisplayName("Testing Day 1,Month 2, Year 2018")
    public void testDay1month2year2018() {
        int x =0;
        int y =1;
        int day = 1;
        int newDay = Main.Day(x,y);
        assertEquals(newDay,day);
        int a = 1;
        int b = 1;
        int month = 2;
        int newMonth = Main.Month(a,b);
        assertEquals(month,newMonth);
        int c = 0;
        int d = 2018;
        int year = 2018;
        int newYear = Main.Year(c,d);
        assertEquals(year,newYear);
    }
    @Test
    @DisplayName("Testing Day 1,Month 3, Year 2020")
    public void testDay1month3year2020() {
        int x =1;
        int y =0;
        int day = 1;
        int newDay = Main.Day(x,y);
        assertEquals(newDay,day);
        int a = 1;
        int b = 2;
        int month = 3;
        int newMonth = Main.Month(a,b);
        assertEquals(month,newMonth);
        int c = 2;
        int d = 2018;
        int year = 2020;
        int newYear = Main.Year(c,d);
        assertEquals(year,newYear);
    }
}
