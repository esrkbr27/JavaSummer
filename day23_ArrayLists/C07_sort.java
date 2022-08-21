package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        /*
        sort metodu sıralma yapar, Arraylerdekı sortla aynı görevı yapar.ancak sort metodunu arraylerdekı
        gibi direk kullanamayız,collectıons sınıfından import ederek kullanabiliriz.
         */

        Collections.sort(urunler); //bize bir sey dönmez ama urunlerı yazdırır.
        System.out.println(urunler); //[cay, cekirdek, ikram, nutella] alfabetık sıralama

        /*
        list ile gelen sort metodunda sıralama özelliğine girmek gerekiyor.bunun yerıne collectıon classındn sort
        metodunu kullanıyoruz. bu metod lıstemızı natural ordera göre sıralar.
         */
    }
}
