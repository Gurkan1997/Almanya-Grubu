package Training;
import java.util.Scanner;
public class soru11 {
    public static void main(String[] args) {

        /*
            Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
            Ad ve soyadın baş harfleri büyük olmalıdır
            Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
            Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
            Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
            Giriş :
             > Gandalf Grey 563245879632
            Çıktı :
             > İsim : G****** G***
             > CCN : **** **** 9632
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim= scan.next();
        System.out.println("Lutfen kredi karti numaranizi giriniz");
        String kartNu= scan.next();

        if (kartNu.length()==16){
            System.out.println("Isim : "   + isim.toUpperCase().substring(0,1)+isim.substring(1).replaceAll("\\w","*")+
                                        " "+ soyIsim.toUpperCase().substring(0,1)+soyIsim.substring(1).replaceAll("\\w","*")+
                                "\nCCN : " + kartNu.replaceAll(kartNu.substring(0,12),("**** **** ")));
        }else System.out.println("gecersiz kart numarasi");
    }
}