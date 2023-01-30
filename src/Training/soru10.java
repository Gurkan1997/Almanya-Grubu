package Training;

import java.util.Scanner;

public class soru10 {

    public static void main(String[] args) {

        /* Soru 10
         Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

         **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
         If konusunu hatırlayın!***
                           Kullanıcıya aşağıdaki gibi mesaj verin:

                            Eğer VKİ 18.5'ten az ise --> zayıfsınız
                            Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
                            Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
                            VKİ 30'a eşit veya daha fazlaysa --> obez

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vki=kilo/(boy/100*boy/100);

        if (vki<18.5 && vki>0){
            System.out.println("zayifsiniz");
        } else if (vki>=18.5 && vki<25) {
            System.out.println("kilonuz ideal");

        } else if (vki>=25 && vki<30) {
            System.out.println("sismansiniz");

        } else if (vki>=30) {
            System.out.println("obezsiniz");

        }else System.out.println("gecersiz islem");
    }
}