package soru_25Aralik22;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class soru41 {
    public static void main(String[] args) {
        /*Soru 41-)
        Parametre olarak 2 Int Array kabul eden ve
        2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
                * input1={1,2,3,4}
                * input2={5,6}
                * Çıktı={1,2,3,4,5,6}
                */
        int []input1={1,2,3,4};
        int []input2={5,6,7,8};
        birlesik(input1,input2);

    }public static void birlesik(int []input1,int[]input2) {
        int[] newArr = new int[input1.length + input2.length];

        for (int i = 0; i < input1.length; i++) {
            newArr[i] = input1[i];
            System.out.print(input1[i]);

            for (int j = 0; j < input2.length; j++)
                newArr[input1.length + j] = input2[j];

        }
        System.out.println(Arrays.toString(newArr));
    }
}