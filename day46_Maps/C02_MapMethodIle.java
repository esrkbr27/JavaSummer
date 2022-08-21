package day46_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapMethodIle {

    public static void main(String[] args) {
        /*
        ReusableMethods classında oluşturudugumuz metodu,
        class ismi yazıp nokta koyup cağırdık, ama bu classın
        bir öğesi olması için bir mapOlusturup ona metodu atadık.

         */
        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // value'lari sira numarali olarak yazdir
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);
        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);



    }
}
