package Training;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {

        //  Soru9
        //  Girilen zamanı saniyeye çeviriniz.
        //  Örnek: 2 saat 3 dakika 10 saniye ==>     7390 saniye
        //  Ipucu:
        //  Saati alıp saniyeye cevirebilirsiniz.
        //  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen saati giriniz");
        int saat= scan.nextInt();
        System.out.println("lutfen dakika giriniz");
        int dakika=scan.nextInt();
        System.out.println("lutfen saniye giriniz");
        int saniye= scan.nextInt();

        int toplamSaniye=(saat*60*60)+(dakika*60)+saniye;
        System.out.println(saat+" saat "+dakika+" dakika " + saniye+
                " saniye"+" = "+toplamSaniye+" saniye");
    }
}
