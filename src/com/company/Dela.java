package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Dela {
    ArrayList<String> onToday = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    public Dela() {
    }

    void Delaa(int hour, int minutes) {
        Date date1 = new Date();
        LocalTime time = LocalTime.of(hour, minutes, 0, 0);
        int hours = date1.getHours();
        int hoursDela = time.getHour();
        int minute = date1.getMinutes();
        int minuteDela = time.getMinute();
        if (hoursDela < hours) {
            System.out.println("Ваши дела не могут быть записаны на прошедшее время");
        } else if (hoursDela == hours) {
            if (minuteDela <= minute) {
                System.out.println("Похоже вы записали дела на прошедшее время, попробуйте указать верное число");
            } else {
                System.out.println("Прекрасно, ваши дела записаны на: " + time);
            }
        } else {
            System.out.println("Прекрасно, ваши дела записаны на: " + time);
            this.onToday.add(String.valueOf(time));
        }

    }

    void DelaTodayList() {
        System.out.println("Ваши дела на сегодня: ");
        for (String s : onToday) {
            System.out.println(s);
        }
    }
}

