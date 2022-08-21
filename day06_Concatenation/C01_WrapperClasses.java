package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
 // javanın hazır metodları kullanbilmemiz için primitive data türlerinin her biriiçin açtığı classlardr.

             /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir
        int --> Integer
        char --> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String str="Java ile hayat ne güzel"; //String non primitive data turu oldugu için metod barındırır.

        System.out.println(str.toUpperCase());


        boolean güzelMi=true;
        //  güzel mi. boolean primitive olduğundan hazır metodu bulunmuyor.

        Boolean buGüzelMi= true;
        buGüzelMi.toString();



        String ogrenciNo="123456";

        //kullanıcıdan bir şifre isteyin eger şifre sadece rakamlardan oluşuyorsa kabul etmeyin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz");

        String sıfre=scan.nextLine(); //12000
        Integer sifresayi=Integer.parseInt(sıfre);
        //parseInt. metodu rakamlardan oluşan string bir ifadeyi intg çevirir.

        System.out.println("girilen sifrenin 3 fazlası : "+ (sıfre+3)); //120003
        System.out.println("İnteger sifrenin 3 fazlası : "+ (sifresayi+3));//12003


    }
}
