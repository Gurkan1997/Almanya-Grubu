package soru_25Aralik22;

import java.util.Arrays;

public class soru19 {
    public static void main(String[] args) {

        // Soru19: Bir integer Array'de bulunan sayılardan
        // 2.büyük olanı bulan java programı yazınız.

        int[] sayilar= {1,2,5,8,9,74,25,68,32,2154,65,325,7};
        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-2]);
    }
}
