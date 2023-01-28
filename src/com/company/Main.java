package com.company;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);





        DelaOfYear delaOfYear = new DelaOfYear();
        Dela delaToday = new Dela();

        while (true) {

            printMenu();
            int command = scanner.nextInt();

            if(command == 1){
                System.out.println("На какое время вы хотите записать в ежедневник?");
                System.out.println("Введите часы");
                int x;
                while (true) {
                    x = scanner.nextInt();
                    if (x < 0) {
                        System.out.println("Ваше время не может быть отрицательно");
                    } else if (x > 23) {
                        System.out.println("Ваше время не может быть больше 23 часов");
                    }
                    else {
                        break;
                    }
                }


                System.out.println("Введите время (минуты)");
                int y;
                while (true) {
                    y = scanner.nextInt();
                    if (y < 0) {
                        System.out.println("Ваше время не может быть отрицательно");
                    } else if (y > 59) {
                        System.out.println("Ваше время не может быть больше 60 минут");
                    }
                    else {
                        break;
                    }
                }

                delaToday.Delaa(x, y);
            }

            else if (command == 2){
                int dayMax = 0;
                System.out.println("Какого месяца у вас дела? 1 - Январь; 2 - Февраль; 3 - Март; 4 - Апрель; 5 - Май; 6 -Июнь; 7 - Июль; 8 - Август; 9 - Сентябрь; 10 - Октябрь; 11 - Ноябрь; 12 - Декабрь;");
                int x = scanner.nextInt();

                if (x == 8 || x == 1 || x == 3 || x == 5 || x == 7 || x == 10 || x == 12){
                    dayMax = 31;
                }
                else if(x == 2){
                    dayMax = 28;
                } else if (x == 6 || x == 4 || x == 9 || x == 11) {
                    dayMax = 30;
                }

                System.out.println("Какого числа у вас дела?");
                int y;
                while (true){
                    y = scanner.nextInt();
                    if(y > dayMax){
                        System.out.println("Ваше число превышает кол-во дней в месяце");
                    }
                    else if(y < 1){
                        System.out.println("Ваше число не должно быть меньше 0");
                    }
                    else {
                        break;
                    }
                }

                delaOfYear.DataMaker(y, x);
            }
            else if (command == 3){

                System.out.println("Какие дела вы хотите посмотреть?");
                System.out.println("1 - на сегодня, 2 - на год");
                int num = scanner.nextInt();
                while (true) {
                    if (num == 1) {
                        delaToday.DelaTodayList();
                        break;
                    } else if (num == 2) {
                        delaOfYear.ListDelOnYear();
                        break;
                    } else System.out.println("Ошибка, вы ввели неправильное число");
                }
            } else if (command == 4) {
                System.out.println(dateFormat.format(calendar.getTime()));
            } else if(command == 0){
                break;
            }
            else {
                System.out.println("Извините такой команды пока что нет");
            }


        }
    }




    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Записать дела на сегодня");
        System.out.println("2 - Записать дела на другое число");
        System.out.println("3 - посмотреть ваши дела");
        System.out.println("4 - посмотреть сегодняшнее число");
        System.out.println("0 - Выйти из приложения");
    }

}