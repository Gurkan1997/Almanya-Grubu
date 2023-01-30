package Training;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alin
        // sayinin rakamlar toplamini bulun

        int sayi=254615487;
        int index=0;
        int toplam=0;

        while (sayi!=0) {
            index = sayi % 10;
            toplam=index+toplam;
            sayi=sayi/10;

        }System.out.println(toplam);
    }
}