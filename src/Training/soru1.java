package Training;

public class soru1 {
    public static void main(String[] args) {

        /*
        Soru 1 Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
                * r=7;
                * Pi=3.14
                * Dairenin Cevresi : 2*Pi*r
                * Dairenin Alani : Pi*r*r  (edited)
        */

        double r=7;
        double pi=3.14;
        double cevre=2*pi*r;

        System.out.println("dairenin çecresi:"+ cevre);
        double alan=pi*(r*r);
        System.out.println("dairenin alanı:"+ alan);
    }
}