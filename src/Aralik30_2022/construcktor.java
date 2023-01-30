package Aralik30_2022;
public class construcktor {
    /*Soru 43-)
    Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp
    konsolda yazdıralım.*/
    String isim="Kerim";
    int yas=22;

    construcktor(){

    }
    construcktor(String isim,int yas){
        this.isim="Kazim";
        this.yas=12;
    }

    @Override
    public String toString() {
        return  "isim= " + isim +
                "\nyas= " + yas;
    }
    public static void main(String[] args) {

        construcktor personel1=new construcktor();
        construcktor personel2=new construcktor("Zeki",56);
        System.out.println(personel1);
        System.out.println(personel2.toString());
    }
}
