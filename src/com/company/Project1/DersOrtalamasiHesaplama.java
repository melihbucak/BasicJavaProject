package com.company.Project1;

import java.util.Scanner;

/**
 * @author mbucak on 22.04.2024 11:00
 * Ders ortalamasi hesaplama
 */
public class DersOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double fizik = girdi.nextDouble();
        System.out.println("Fizik notu: " + fizik);

        double matematik = girdi.nextDouble();
        System.out.println("Matematik notu: " + matematik);

        double turkce = girdi.nextDouble();
        System.out.println("Turkce notu: " + turkce);

        double muzik = girdi.nextDouble();
        System.out.println("Muzik notu: " + muzik);

        double tarih = girdi.nextDouble();
        System.out.println("Tarih notu: " + tarih);

        double ortalama = (fizik + matematik + turkce + muzik + tarih) / 5;
        System.out.println("Ortalamaniz : " + ortalama);

        String sonuc = (ortalama > 60) ? "Basarili" : "Basarisiz";
        System.out.println(sonuc);
    }
}
