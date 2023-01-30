package Training;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        //  soru4-Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        //  Ipuclari:
        //* Sayinin küpü: sayi*sayi*sayi

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı=scan.nextDouble();
        double kup=(sayı*sayı*sayı)/2;
        System.out.println("sayının kupunun yarısı="+kup);
    }
}
