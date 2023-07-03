package com.java.week5;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NoOfWorkingDays {
    public static void main(String[] args)
    {
        LocalDate startDate=LocalDate.of(2023,7,1);

        LocalDate EOM=startDate.withDayOfMonth(startDate.lengthOfMonth());

        int workingdayds=0;
        LocalDate currentDate=startDate;
        while (!currentDate.isAfter(EOM))
        {
            if(currentDate.getDayOfWeek()!= DayOfWeek.SATURDAY && currentDate.getDayOfWeek()!= DayOfWeek.SUNDAY)
            {
                workingdayds++;
            }
            currentDate=currentDate.plusDays(1);
        }
        System.out.println("Number of working days too EOM: "+workingdayds);
    }
}
