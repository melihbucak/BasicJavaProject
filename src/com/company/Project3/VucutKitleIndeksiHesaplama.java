package com.company.Project3;

import java.util.Scanner;

/**
 * @author mbucak on 22.04.2024 11:21
 * Vucut kitle endeksi hesaplama
 */
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double boy, kilo, indeks;
        System.out.print("Boy (m): ");
        boy = scanner.nextDouble();

        System.out.print("Kilo: ");
        kilo = scanner.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksi: " + indeks);
    }
}
