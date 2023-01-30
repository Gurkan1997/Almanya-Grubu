package soru_25Aralik22;
/*
    int input=4737;
        String sonuc= "Sayi asal";

        for (int i = 2; i < input ; i++) {

            if (input%i==0){
                sonuc="Sayi asal degil";
                break;
                // Java, bir loop'un icerisinde "break" gorurse
                // o loop'u bitirir
            }
        }
        System.out.println(sonuc);
 */
public class soru20 {
    public static void main(String[] args) {

        // Soru 20 : Bir sayının asal sayı olup olmadığını
        // method olarak döndüren java programı yazınız.

        int sayi = 290;
        System.out.println(asalmi(sayi));
    }
    public static boolean asalmi(int sayi) {

        boolean asalmi = true;

        for (int i = 2; i < sayi; i++) {

            if ((sayi % i == 0)) {
                asalmi = false;
                break;
            }
        }
        return asalmi;
    }
}