package soru_25Aralik22;
  /*     Soru 43-)
Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve
konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım.
Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
        */
public class soru43 {
    String isim;
    int yas=32;
    public soru43(){
        isim="Hasan";
    }
    public soru43(String isim,int yas){
        this.isim="Veli";
        this.yas=12;
    }
    @Override
    public String toString() {
        return "soru43{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }public static void main(String[]args){

        soru43 personel1=new soru43();
        soru43 personel2=new soru43("Alisan",8);
        System.out.println(personel1.toString());
        System.out.println(personel2.toString());
    }
}