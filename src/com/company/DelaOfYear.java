package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DelaOfYear {

    ArrayList<String> onYearList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void DataMaker (int day, int month){

        int year = 2023;
        LocalDate  date1 = LocalDate.of(year, month, day);
        LocalDate dateToday23 = LocalDate.now();


        if (dateToday23.isAfter(date1)) {
            System.out.println("Ваша дата стоит перед сегодняшней");
        }else if(date1.equals(dateToday23)) {
            System.out.println("Вы поставили сегодняшнюю дату, пожалуйста перейдите в метод 1, он вам больше пригодится :)");

        } else {
            System.out.println("Вы записали свои дела на дату: ");
            System.out.println(LocalDate.of(year, month, day));
            System.out.println("За неделю до этого числа мы вам напомним и вы сможете записать время");
            onYearList.add(String.valueOf(date1));
        }


    }

    void ListDelOnYear(){
        System.out.println("Ваши дела: ");
        for (String s : onYearList) {
            System.out.println(s);
        }
    }
}

