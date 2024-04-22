package com.company.Project2;

import java.util.Scanner;

/**
 * @author mbucak on 22.04.2024 11:02
 * KDV hesaplama
 */
public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar, oranKdv, tutarKdv, tutarKdvli;

        System.out.print("Tutar giriniz : ");
        tutar = scanner.nextDouble();

        System.out.print("KDV orani giriniz : " + "% ");
        oranKdv = scanner.nextDouble();

        tutarKdv = (tutar * oranKdv) / 100;
        System.out.println("KDV tutari : " + tutarKdv);

        tutarKdvli = tutar + tutarKdv;
        System.out.println("KDV' li toplam tutar : " + tutarKdvli);

    }
}
