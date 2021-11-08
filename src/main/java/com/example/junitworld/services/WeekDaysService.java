package com.example.junitworld.services;

public class WeekDaysService {
    public String getDayByNumber(int weekNumber){
       switch (weekNumber){
           case 1:
               return "MONDAY";
           case  2:
               return "TUESDAY";
           case  3:
               return "WEDNESDAY";
           case  4:
               return "THURSDAY";
           case  5:
               return "FRIDAY";
           case  6:
               return "SATURDAY";
           case  7:
               return "SUNDAY";
           default:
               return "NOT_FOUND";
       }
    }
}
