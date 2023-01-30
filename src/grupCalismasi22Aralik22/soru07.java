package grupCalismasi22Aralik22;

import java.util.Scanner;

public class soru07 {
    public static void main(String[] args) {

        /* Soru 7- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifrenizi girin");
        String sifre = scan.nextLine();
        int flag=0;


        if (!(sifre.contains(sifre.toLowerCase()))){
            System.out.println("Sifre kucuk harf icermelidir");
            flag++;
        }if (!(sifre.contains(sifre.toUpperCase()))){
            System.out.println("Sifre buyuk harf icermelidir");
            flag++;
        }if (!(sifre.contains("\\W"))){
            System.out.println("Sifre ozel karakter icermelidir");
            flag++;
        }if (!(sifre.length()-1>=8)){
            System.out.println("Sifre en az 8 karakter olmalidir");
            flag++;
        }if (flag==0){
            System.out.println("Sifreniz Kabul edilmistir");
        }





    }
}
