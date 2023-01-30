package Training;

import java.util.Scanner;

public class soru32 {
    public static void main(String[] args) {

        /*  Soru 5: Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
            :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
            yazdirin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scanner.nextLine();
        int kSayi=kelime.length();
        int ortasi=kelime.length()/2;
        if (kelime.length() % 2 == 0) {
            kelime = kelime.substring(0, ortasi) + ":)" + kelime.substring(ortasi);
        } else {
            kelime = kelime.substring(0, ortasi) + ":(" + kelime.substring(ortasi+1);
        }
        System.out.println(kelime);
    }
}
