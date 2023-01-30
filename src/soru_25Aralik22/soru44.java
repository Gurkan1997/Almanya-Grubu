package soru_25Aralik22;
import java.util.Scanner;
        /*
            Soru 44-)
            Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
            Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
            methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
            Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
            Changesurname adlı bir method oluşturun, bu method lastname'i parametre olarak alsın.
            Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
         */
public class soru44 {
    public static void main(String[] args) {

        String firstName = "Zeki";
        String lastName = "Muren";
        int age = 15;
        String classRoom = "11-B";
        Changename();

    }public static void Changename(){

        String firstName = "Namik";
        String lastName = "Hadigari";
        int age = 14;
        String classRoom = "10-B";
        System.out.println("isim : "+ firstName +"\nlastname : "+ lastName +"\nage : "+ age +"\nclassroom : "+ classRoom);
        System.out.println("isim : "+ firstName +"\nlastname : "+Changesurname()+"\nage"+ age +"\nclassroom : "+ classRoom);

    }public static String Changesurname(){
        Scanner scan=new Scanner(System.in);
        System.out.println("soyisminizi giriniz");
        return scan.next();
    }
}