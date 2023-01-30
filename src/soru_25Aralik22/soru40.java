package soru_25Aralik22;
public class soru40 {
    public static void main(String[] args) {

        /*
            Soru-40)
            Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
            Örn:
            girdi : {1,2,3,4,5,6,7,8}
            çıkış: 36
            ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 80};
        elemanTopla(arr);

    }public static void elemanTopla(int[] arr){
        int toplam=0;

        int i = 0;
        while (i < arr.length) {
            toplam+=arr[i];
            i++;
        }
        System.out.println(toplam);
    }
}