package Training;

import java.util.Arrays;

public class soru {
    public static void main(String[] args) {

        short arr[] = new short[4];

        arr[0] = 10;

        arr[1] = 11;

        arr[2] = 12;

        arr[3] = 13;

        System.out.println(Arrays.toString(arr));
        System.out.print(arr[4]);
        System.out.print(arr[3]);
        System.out.print(arr[arr.length-1]);
        System.out.print(arr[arr.length+1]);

    }
}