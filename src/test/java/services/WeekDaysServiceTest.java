package services;

import com.example.junitworld.services.WeekDaysService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekDaysServiceTest {
    @Test
    public void getWeekDaySuccess(){
        WeekDaysService weekDaysService = new WeekDaysService();
        String actualResult = weekDaysService.getDayByNumber(1);
        String expectedResult = "MONDAY";

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWeekDayCaseTwoSuccess(){
        WeekDaysService weekDaysService = new WeekDaysService();
        String actualResult = weekDaysService.getDayByNumber(2);
        String expectedResult = "NOT_FOUND";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWeekDayCaseFailure(){
        WeekDaysService weekDaysService = new WeekDaysService();
        String actualResult = weekDaysService.getDayByNumber(10);
        String expectedResult = "NOT_FOUND";

        assertEquals(expectedResult, actualResult);
    }
}
