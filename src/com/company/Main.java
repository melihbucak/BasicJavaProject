package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double value = girdi.nextDouble();
        System.out.println("Fizik notu: " + value);

        double value1 = girdi.nextDouble();
        System.out.println("Matematik notu: " + value1);

        double value2 = girdi.nextDouble();
        System.out.println("Türkçe notu: " + value2);

        double value3 = girdi.nextDouble();
        System.out.println("Müzik notu: " + value3);

        double value4 = girdi.nextDouble();
        System.out.println("Tarih notu: " + value4);

        double avg = (value + value1 + value2 + value3 + value4) / 5;
        System.out.println("Ortalamanýz:"+ avg);

    }
}
