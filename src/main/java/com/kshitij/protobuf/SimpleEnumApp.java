package com.kshitij.protobuf;

import static simple.enumeg.day.DayEnum.DayOfTheWeekEnum;
import static simple.enumeg.day.DayEnum.WeekDay;

public class SimpleEnumApp {
    public static void main(String[] args){
        WeekDay.Builder weekDayBuilder= WeekDay.newBuilder();
        weekDayBuilder.setId(1)
                .setDayOfTheWeek(DayOfTheWeekEnum.MONDAY);
        WeekDay weekDay=weekDayBuilder.build();
        System.out.println("The weekday is "+weekDay);
        //JsonFormat.printer().print(weekDayBuilder);

    }


}
