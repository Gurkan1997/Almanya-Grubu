package Training;

import java.util.Arrays;

public class soru38 {
    public static void main(String[] args) {
        
        //Soru 33-)
        //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str=''Kodlama harika.''
        //String arr[]: ".etaerg si gnidoC"
        //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
        
        String str="Kodlamaharika.";
        String[] strArray=str.split("");
        System.out.println(Arrays.toString(strArray));
        String[] reversestr=new String[str.length()];
        
        for (int i =0; i <reversestr.length ; i++) {
            reversestr[i]=strArray[(strArray.length-i)-1];
        }
        System.out.println(Arrays.toString(reversestr));
    }
}
