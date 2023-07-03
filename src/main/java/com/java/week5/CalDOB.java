package com.java.week5;

import java.time.LocalDate;
import java.time.Period;

public class CalDOB {
    public static void main(String[] args)
    {
        String DateofBirth="1998-03-14";
        LocalDate birthdate=LocalDate.parse(DateofBirth);

        LocalDate currentDate=LocalDate.now();

        Period age=Period.between(birthdate, currentDate);

        System.out.println("Age: "+age.getYears()+"years,"+age.getMonths()+"months, "+age.getDays()+"days");

    }
}
