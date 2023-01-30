package Aralik29_2022;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    /*
        Soru 21:
         Bir Integer Array içerisinde bazı elementler birden fazla bulunmaktadır.
         Tekli elemanları oluşturacağımız yeni Array'e aktaran bir method oluşturup,
         yeni Array'i yazdıralım.
         örnek: int [] array={3,7,9,6,7,3,5,4,1,8,6,9}
         Çıktı : yeniArray={5,4,1,8}
         */
public class soru21 {
    public static void main(String[] args) {

        int[] array1 = {3, 3, 7, 7, 9, 6, 7, 3, 5, 4, 1, 8, 6, 9};
        Arrays.sort(array1);
        List<Integer> liste=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            int sayac=0;
            for (int j = 0; j < array1.length; j++) {
                if (array1[i]==array1[j] && i!=j){
                    sayac++;
                }
            }
            if (sayac==0){
                liste.add(array1[i]);
            }
        }
        System.out.println(liste);
    }
}