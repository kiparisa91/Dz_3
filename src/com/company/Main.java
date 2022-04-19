package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задача1
        int clientIos = 0;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientAnd = 1;
        if (clientAnd == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача2
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientIos == 0) {
            System.out.println("Установите облегченную версию для iOS");
        } if (clientDeviceYear < 2015 && clientAnd == 1) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Приложение устанавливается");
        }

        //Задача3
        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        //Задача4
        int delyveryDistance = 95;
        if (delyveryDistance < 20) {
            System.out.println("Потребуется один день");
        } else {
            System.out.println("Потребуется дней: " + ((delyveryDistance-21) / 40+2));
        }


        //Задача5
        int monthNumber =12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }






    }
}
