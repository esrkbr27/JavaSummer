package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler.indexOf("ikram"));//1
        //listın içinde primitive data türü olmaz strıng non primitive oldugu için kabul etti
        /*
        indexof metodu bız bılgı döndüren bir metottur, listemızı değiştirmez.


         */

        urunler.lastIndexOf("ikram"); //1
        /*
        indexof metodu ürünü aramaya 0. indexden lastIndexOf metodu ise aramaya son indexden baslar ama
        buldugu andan itibaren bastan saymaya baslar.
         */

        urunler.add("ikram");
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay, ikram]
        System.out.println(urunler.indexOf("ikram"));//1
        System.out.println(urunler.lastIndexOf("ikram"));//4


        System.out.println(urunler.indexOf("Hobby")); //-1
        System.out.println(urunler.lastIndexOf("Hobby")); // -1 döndürdü.


    }
}
