package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        List<String> urunler2 = new ArrayList<String>();

        urunler2.add("nutella");
        urunler2.add("cay");
        urunler2.add("cekirdek");
        urunler2.add("ikram");

        System.out.println(urunler.equals(urunler2)); //false (urun sıralaması farklı oldugu için aynı degıl)

        Collections.sort(urunler);//sort ile sıralamlarını aynı yaptık()
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2)); // true

    }
}
