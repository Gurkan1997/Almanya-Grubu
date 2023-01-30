package Training;

public class soru6 {
    public static void main(String[] args) {

        // Soru6 - Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //         input1 : "15.30 €" , input2 : "11.40 €"
        //         output : 26.70 €

        String sayi1="15.40 €";
        String sayi2="11.40 €";

        String str1=sayi1.substring(0,5);
        String str2=sayi2.substring(0,5);

        double dbl1=Double.parseDouble(str1);
        double dbl2=Double.parseDouble(str2);
        double toplam=dbl1+dbl2;

        System.out.println(toplam+" €");
    }
}
