package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
/*
   map.containsKey-->verdiğimiz keyin mapte olu olmadıgını boolean olarak döner.
   map.containsValue-->bir bütün olarak value nun mapte olup olmadıgını döner.

   ÖNEMLİ NOT: map.containsValue valuenun içindeki bir parcayı bulmada işe yaramaz.
              eger value içindeki bir parcayı aratmak istiyorsak Map üzerinde
              manipulation  metotları yapmamız lazım.

    map.get(key)-->verilen keye ait değeri döndürür.

 */
        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));//false

        //verilen mapte JDev  yerine JavaDeveloper olarak değiştirelim.
        /*
        Maplerde replace tüm value yu değiştirmek istersek kullanılabilir,
        kısmı değişikliklerde kullanamayız.
         */

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Mapi güncelleme yapmak için key, yenidegeri mape eklemeliyiz.
        /*
        örneğin key 101 için value Ali, Can, JDev
        güncelleme için put(101, Ali, Can, JavaDeveloper

        bunu yapabilmek için herbir keye ve ona ait value ya ihtiyac var.
         */
        Set<Integer> keySeti=sinifListMap.keySet();

        String eachValue;
        for (Integer each : keySeti) {
            eachValue=sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each, eachValue);
        }
        System.out.println(sinifListMap);

        /*
        Biz keylerin tamamını aldık, herbir keyin valuesunu
        valuesunu getiridk(get(each), value üzerinde değişiklik yapıp
        yeni halini put(key, yeniDeger) ile mape koyduk
         */



    }
}
