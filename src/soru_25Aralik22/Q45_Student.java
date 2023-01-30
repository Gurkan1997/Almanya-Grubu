package soru_25Aralik22;
       /* Ardından Student
        adlı bir class olusturun ve içine parametreli constructor koyun,
        bu parametreler Maın classdaki bılgılerı ıstesın.
        Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
        Ardından consolda girilen bilgileri yazdırın */
public class Q45_Student {
    String ad;
    String soyAd;
    int yas;
    char cinsiyet;
    String okul;
           @Override
           public String toString() {
               return  "Adı: " + ad +
                       "\nSoyadı: " + soyAd +
                       "\nYaşı: " + yas +
                       "\nCinsiyeti: " + cinsiyet +
                       "\nOkulu: " + okul ;
           }
           public Q45_Student(String ad, String soyAd, int yas, char cinsiyet, String okul) {
               this.ad=ad;
               this.soyAd=soyAd;
               this.yas=yas;
               this.cinsiyet=cinsiyet;
               this.okul=okul;
    }
}