package Training;

import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {

        /*
            Soru 16-)   Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin
                        2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.

                        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                                Loopun içerisinde String methodlarından  yararlanalım!
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen en az 5 harfli bir kelime giriniz");
        String kelime= scan.next();

        while (!(kelime.length()>=5)){
            System.out.println("girdiginiz kelime en az 5 harfli olamli\nLutfen yeni bir kelime giriniz");
            kelime= scan.next();
        }String yeniKelime=kelime.substring(kelime.length()-3).repeat(2);
        System.out.println(yeniKelime);

        System.out.println("====================2.cozum========================");

        for (int i = 0; true; i++) {
            if (kelime.length()>=5){
                System.out.println(kelime.substring(kelime.length()-3).repeat(2));
                break;
            }else System.out.println("lutfen 5 harfli bir kelime girin");
            kelime= scan.next();

        }
    }
}
