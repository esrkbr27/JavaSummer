package day46_Maps;

import java.util.*;

public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() {//ilk classta yaptıgımız mape atamayı metodun içine koyduk
        Map<Integer, String> sinifMap = new HashMap<>();
        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Cem, Tester");
        sinifMap.put(106, "Taha, Emre, JDev");
        sinifMap.put(107, "Derya, Deniz, Tester");
        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<>();
        String[] eachArr;
        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void branstakiOgrencisayisiYazdır(Map<Integer, String> sinifLastmap) {
        /*
        brans=branstakiOgrencisayisi seklinde bir map oluşturmam lazım
         */

        Map<String,Integer> bransOgrSayiMap = new TreeMap<String,Integer>();//tree den dolayı harf sırasına göre olacak.
        Collection<String> valuesCollection=sinifLastmap.values();//sınıf listesindekı tüm value aldım.

        String[] valuArr;
        String brans;
        Integer branstakiOgrencisayisi;
        for (String each : valuesCollection) {//Collection daki elemnları(birer string oldugu için) tek tek split kullanarak arraye attım
            valuArr= each.split(",");
            brans=valuArr[2];

            //bransın bu mapte key olarak daha önceden eklenip eklenmediğini kontol etmeliyiz.

            if(!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else{
                branstakiOgrencisayisi=bransOgrSayiMap.get(brans);
                /*
                bu get metodunun içine obje yazınca o objeden kac tane oldugunu döndürüyor.
                "e" den kac tane var bana getir der ama getir dedğini saymıyor.
                ben key giriyorum,o bana kactane getirecegini yazdırıyor.
                 */
                bransOgrSayiMap.put(brans,++branstakiOgrencisayisi);
            }

              System.out.println(bransOgrSayiMap);
        }
    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer,String>> sinifListEntrySeti= sinifListMap.entrySet();
        for (Map.Entry<Integer,String> entry: sinifListEntrySeti
        ) {
            System.out.println(entry);
        }

    }
}