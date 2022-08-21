package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        Elımızde urunlerın bulundugu bir liste var.ürün listesındekı istenen sıradaki ürünü yenisi ile
        değiştirip eskı ürünü var olan eskı ürünler listesine ekleyelim.
         */
        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        List<String> eskiurunler = new ArrayList<String>();
        //listedekı "ıkram"ın yerine "biskrem" koyalım."ikram" ıda eskı urunler listesine ekleyelım.

        String yeniUrun="biskrem";
        String silinecekUrun="ikram";

       int temp=urunler.indexOf("ikram"); //listeyı bilmesem de silinecek urunun indexini bulabilirim

      String silinenUrun=urunler.set(temp,yeniUrun);//string silinecek ürünü verir

        eskiurunler.add(silinenUrun);

        System.out.println("urunler listesı :"+ urunler); //[nutella, biskrem, cekirdek, cay]
        System.out.println("eskıurunler listesı :"+ eskiurunler); //[ikram]



      yeniUrun="kahve";
       silinecekUrun="cay";

        int temp1=urunler.indexOf("ikram"); //listeyı bilmesem de silinecek urunun indexini bulabilirim

        String silinenUrun1=urunler.set(temp,yeniUrun);//string silinecek ürünü verir

        eskiurunler.add(silinenUrun);

        System.out.println("urunler listesı :"+ urunler); //[nutella, biskrem, cekirdek, cay]
        System.out.println("eskıurunler listesı :"+ eskiurunler); //[ikram]


        yeniUrun="fındık";
        silinecekUrun="cekirdek";

        int temp2=urunler.indexOf("ikram"); //listeyı bilmesem de silinecek urunun indexini bulabilirim

        String silinenUrun2=urunler.set(temp,yeniUrun);//string silinecek ürünü verir

        eskiurunler.add(silinenUrun);

        System.out.println("urunler listesı :"+ urunler); //[nutella, biskrem, cekirdek, cay]
        System.out.println("eskıurunler listesı :"+ eskiurunler); //[ikram]




    }
}
