package Training;

public class soru29 {
    public static void main(String[] args) {

        /*  Soru 2 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
            degerlerini degistirin(swap)

         */

        int sayi1=1;
        int sayi2=3;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("ilk sayi : "+sayi1+", ikinci sayi:"+sayi2);
    }
}
