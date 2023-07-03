package com.java.week5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateList {
    public static void main(String[] args)
    {
        List<LocalDate> dates=new ArrayList<>();
        dates.add(LocalDate.of(2023,7,03));
        dates.add(LocalDate.of(2022,3,14));
        dates.add(LocalDate.of(2022,8,8));
        dates.add(LocalDate.of(2022,11,22));
        dates.add(LocalDate.of(1998,3,14));

        LocalDate earliestDate=dates.stream().min(LocalDate::compareTo).orElse(null);
        LocalDate latestDate=dates.stream().max(LocalDate::compareTo).orElse(null);

        System.out.println("Earlist date: "+earliestDate);
        System.out.println("Latest date: "+latestDate);
    }
}
