package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        //contains metodu true false döndürür.

        urunler.contains("nutella"); //true
        System.out.println(urunler.contains("nutella"));//true

        urunler.contains("hobby"); //false
        System.out.println(urunler.contains("hobby"));//false

        List<String> urunler2 = new ArrayList<String>();
        urunler2.add("nutella");
        urunler2.add("ikram");

        //birden fazla eleman aratmak istiyorsam containsAll metodunu kullanırım.
        System.out.println(urunler.containsAll(urunler2)); //true

        urunler2.add("hobby"); //urunler 2 ye yenı eleman ekledım,urunler ile birebir aynı olmadıgı için false verdi
        System.out.println(urunler.containsAll(urunler2)); //false

    }
}
