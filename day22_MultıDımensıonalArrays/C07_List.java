package day22_MultıDımensıonalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<Integer>();
        /*
        list primitive data türlerini kabul etmez.int yazarsak int eleman eklemek için kabul etmez.
        ama wrapper classtan Integer yazınca kabul ediyor.
         */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); //[5,3,7]

        //sadece add yaparsak sona ekler.

        sayilar.add(2,10);//indexı 2 olan yere 10 ekleyelim // [5,3,10,7]
        /*
        add(index,element) istediğimiz indexe istediğimşz elementi yerleştirir,
        eskı elemetı sılmez veya update etmez, (10 u silip 7 yapmadı) yenı element ekler
         */



    }
}
