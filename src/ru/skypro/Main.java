package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int clientOC = 0;
        if (clientOC == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        int clientDeviseYear = 2015;
        if (clientOC == 1) if (clientDeviseYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOC == 0) if (clientDeviseYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOC == 1) {
            if (clientDeviseYear <= 2015) {
            }
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOC == 0) if (clientDeviseYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        int year = 2022;
        if (year % 4 == 0) {
            if (year % 100 == 0 && !(year % 400 == 0)) {
                System.out.println(year + " год не является високосным.");
            } else {
                System.out.println(year + " год является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " принадлежит к сезону осень");
                break;
            default:
                System.out.println(" такого сезона нет!");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1 день!");
        } else {
            if (deliveryDistance < 60) {
                System.out.println("Потребуется дней : 2 дня!");
            } else {
                if (deliveryDistance < 100) {
                    System.out.println("Потребуется дней : 3 дня!");
                }
            }
        }
    }}