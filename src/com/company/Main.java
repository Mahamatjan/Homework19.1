package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Days = scanner.nextLine();
        Days days = com.company.Days.valueOf(Days);

        switch (days){
            case Monday:
                System.out.println("Жава тилин окуй");
                break;
            case Tuesday:
                System.out.println("Англский окуйм");
                break;
            case Wednesday:
                System.out.println("Soft skill барам");
                break;
            case Thursday:
                System.out.println("Event сабагына барам");
                break;
                case Friday:
                    System.out.println("Жава тилин окуйм");
                    break;
            case Saturday:
                System.out.println("Дем алыш");
                break;
            case Sunday:
                System.out.println("Дем алыш");
                break;
            default:
                System.out.println("Мындай кун жок!");
        }


    }
}