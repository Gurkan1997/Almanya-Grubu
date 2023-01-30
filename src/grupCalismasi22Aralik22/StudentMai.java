package grupCalismasi22Aralik22;

import java.util.Scanner;

public class StudentMai {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen öğrencinin adını giriniz: ");
        String ad= scan.nextLine();

        System.out.println("Lütfen öğrencinin soyadını giriniz : ");
        String soyAd=scan.nextLine();

        System.out.println("Lütfen öğrencinin yasini giriniz: ");
        int yas=scan.nextInt();

        System.out.println("Lütfen öğrencinin cinsiyetini giriniz(E/K): ");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lütfen öğrencinin okulunu giriniz: ");
        String okul=scan.next();
    }





}class Student{


    String ad;
    String soyAd;
    int yas;
    char cinsiyet;
    String okul;

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", okul='" + okul + '\'' +
                '}';
    }
}