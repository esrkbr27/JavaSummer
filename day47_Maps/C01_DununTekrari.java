package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

        Map<Integer, String> sinifLastmap = ReusableMethods.mapOlustur();
        System.out.println(sinifLastmap);

        //öğrenci listesini isim soyisim olarak yazınız.

        ReusableMethods.tumValueSiraliYazdir(sinifLastmap);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin.
         ReusableMethods.branstakiOgrencisayisiYazdır(sinifLastmap);
    }
}
