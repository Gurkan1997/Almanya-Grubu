package soru_25Aralik22;
import java.util.Scanner;
    /*
        Soru 45-)
        StudentMaın adında bir class olusturun, ögrenci bilgilerini alın.
        (ad soyad yas cınsiyet okul) Ardından Student
        adlı bir class olusturun ve içine parametreli constructor koyun,
        bu parametreler Maın classdaki bılgılerı ıstesın.
        Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
        Ardından consolda giriilen bilgileri yazdırın
        Ipucu:
        Bu soruda iki classa ihtiyacımız olacak.
        Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
        String isim, int yas, char cinsiyet gibi...
        Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
        bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
        Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız
        ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
        bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
    */
class StudentMain {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Lütfen öğrencinin adını giriniz: ");
    String ad= scanner.nextLine();

    System.out.println("Lütfen öğrencinin soyadını giriniz : ");
    String soyAd=scanner.nextLine();

    System.out.println("Lütfen öğrencinin yasini giriniz: ");
    int yas=scanner.nextInt();

    System.out.println("Lütfen öğrencinin cinsiyetini giriniz(E/K): ");
    char cinsiyet=scanner.next().charAt(0);

    System.out.println("Lütfen öğrencinin okulunu giriniz: ");
    String okul=scanner.next();

    Q45_Student ogrenci=new Q45_Student(ad,soyAd,yas,cinsiyet,okul);
    System.out.println(ogrenci);
    }
}