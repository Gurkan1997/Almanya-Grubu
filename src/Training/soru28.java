package Training;

public class soru28 {
    public static void main(String[] args) {

        // soru: Kullanicidan bir string ve aranacak metin alin.
        // string'in aranan metni icerip icermedigini
        // index of metoduyla bulun

        String str="zen";
        String str1="ben bir gul gordum";

        if (!(str1.lastIndexOf(str)==-1)){
            System.out.println("iceriyor");
        }else System.out.println("icermiyor");
    }
}