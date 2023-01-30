package soru_25Aralik22;
import java.util.Arrays;
public class soru39 {
    public static void main(String[] args) {

        /*
        Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
        verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemini kullanabilirsiniz.

         */

        int[] input= {3,2,5,4,1,6,7,89};
        Arrays.sort(input);
        System.out.println("minumum deger : " + input[0] + "\nmaximum deger : " + input[input.length-1]);
    }
}