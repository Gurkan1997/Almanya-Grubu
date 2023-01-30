package Training;
import java.util.Scanner;
public class soru33_satininTersi {
    public static void main(String[] args) {

        //Soru-28)
        //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int sayi1 = scanner.nextInt();

        while (sayi1>0){  // sayi Buyuktur sifir sarti olustugu surece donguyu calistir.
            System.out.print(sayi1 % 10);
            sayi1= sayi1/10;
        }
    }
}
