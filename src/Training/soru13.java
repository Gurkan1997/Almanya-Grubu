package Training;

public class soru13 {
    public static void main(String[] args) {


        /*
            Soru 13-)
            Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
            Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
            Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
            Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
                    Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
            Ipucu:
            Switch konusunu hatırlayalım!

        */

            char cevap='b';

            switch (cevap){
                case 'a':
                    System.out.println("Isteginiz isleniyor");
                    break;
                case 'b':
                    System.out.println("Degerlendirmeniz icin yine de tesekkur ederiz");
                    break;
                case 'c':
                    System.out.println("Uzgunum su anda yardimci olamiyoruz");
                    break;
                default:
                    System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
            }
    }
}
