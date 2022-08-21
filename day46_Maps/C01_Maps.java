package day46_Maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<Integer,String>();
        sinifList.put(101,"Ali, Can, JDev\n");
        sinifList.put(102,"Enes, Cem, Tester\n");
        sinifList.put(103,"Taha, Emre, JDev\n");
        sinifList.put(104,"Derya, Deniz, Tester\n");

        System.out.println(sinifList);//{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());
        System.out.println(sinifList.values().size());//4 element
        System.out.println(sinifList.values());

        //tüm öğrencilerin isim ve soyisimlerini alt alta yazdırın.

       Collection<String> tumValueColl =sinifList.values();

        String [] eachArr;
        int sira=1;
        for (String each:tumValueColl) {
            /*buradakı each bize her bir öğrenciye ait
            ayni yapıdakı isim ,soyisim,brans bilgilerini
             içeren Stringler getiriyor.
            */
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]+"-->brans"+eachArr[2]);
            sira++;

        }
        /*
        Map te bulunan öğrencilerin isim ve soyisimlerini
        birleştirerek bir sınıf listesi oluşturun
         */

        List<String> sinifIsimSoyIsimlist = new ArrayList<String>();
        for (String eachs : tumValueColl) {
            eachArr=eachs.split(", ");
            sinifIsimSoyIsimlist.add(eachArr[0]+" "+eachArr[1]);

        }

        System.out.println(sinifIsimSoyIsimlist);


    }
}
