package Training;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden
        // sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(5);

    }public static void fibonaccidenSayiYazdir(int sayi){

        int sayi1=0;
        int sayi2=1;
        int sayi3 = 0;
        System.out.print("0 1 " );

        for (int i = 3; i <=sayi ; i++) {
            sayi3=sayi1+sayi2;
            System.out.print(sayi3+" ");
            sayi1=sayi2;
            sayi2=sayi3;
        }
    }
}
