package Training;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {

       /* Soru12
            Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
            hesaplamak ve yazdırmak için bir program oluşturalım
            Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
            Ipucu:  IF/Else kullanabilirsiniz.
            Örnek:
             İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
            Konsolda Çıktı :
            Sayıların toplamı: 71  veya  Fazla Yüklenme
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=sayi1+sayi2;

        if (!(sayi1>999999999 || sayi2>999999999 || toplam>999999999)){
            System.out.println("sayilarin toplami : " + toplam);

        }else System.out.println("fazla yuklenme");
    }
}

