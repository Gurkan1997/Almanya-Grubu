package Training;
import java.util.Scanner;
public class soru7 {

    public static void main(String[] args) {

        /*
           Soru7 Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
           Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
           1 şeker = 1.5 gr
           1 kg = 1000 gram olarak hesaplayın.
           Ipuclari:
           Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("gunde kac bardak cay icersiniz");
        double gunlukCay= scan.nextDouble();
        System.out.println("bir bardaga kac seker atarsiniz ");
        double gunlukSeker=scan.nextDouble();

        double yillikCayMiktari=gunlukCay*365;
        double yillikSekerMiktari=(gunlukCay*1.5)*365/1000;

        System.out.println("Yillik cay miktari : " + yillikCayMiktari+" bardak"+
                            "\nYillik seker miktari : "+ yillikSekerMiktari+" kg");











    }
}
