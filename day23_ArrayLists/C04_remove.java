package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        /*
              remove metodu iki şekilde kullanılır.(remove un içine ya obje yazabilirsin,ya da index no)
                1. objeyı yazıp silmesını ıstersek bıze boolean sonuc doner.
                2.index girersek o indexdekı elemanı siler ve bıze silinen elamanı döndürür.
                 */

        System.out.println(urunler); //[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram")); //true (yanı ikramı sildim dedi)
        System.out.println(urunler);//[nutella, cekirdek, cay]
        System.out.println(urunler.remove("hobby")); //false (hobby olmadıgı ıcın sılemedım dedı)


        // ikinci yöntem deneyelim remove (index) girelim

        System.out.println(urunler.remove(1)); // listeye gidip indexi 1 ı bulup silecek.(sildiği ürünü yazdırdı.)
        System.out.println(urunler);
        //olmayan bir indexi silmeye calışırsak exceptıon verir.
        //System.out.println(urunler.remove(3)); // run tıme error
    }
}
