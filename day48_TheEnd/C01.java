package day48_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01 {
    /*
    eger bir element ile ilgili tuttacagınız bilgiler coksa
    veya kompleks ise
    iç içe map kullanabiliriz

    iç içe map kullandıgınızda daha fazla datayı daha düzenli olarak tutma
    imkanınız olur , ancak bilgiye ulaşmak ve maipüle etmek
    zorlaşacaktır.

    Örnek olarak dünkü mapimizi maplerden oluşan
    bir map olarak oluşturalım.
     */
    public static void main(String[] args) {

   Map<String, String> ogr101 = new HashMap<String, String>();
       ogr101.put("isim", "Enes") ;
       ogr101.put("soyisim", "Cem") ;
       ogr101.put("brans", "Tester") ;

        Map<String, String> ogr102 = new HashMap<String, String>();
        ogr102.put("isim", "Taha") ;
        ogr102.put("soyisim", "Emre") ;
        ogr102.put("brans", "JDev") ;

        Map<String, String> ogr103 = new HashMap<String, String>();
        ogr103.put("isim", "Derya") ;
        ogr103.put("soyisim", "Deniz") ;
        ogr103.put("brans", "Devops") ;


        Map<Integer,Map<String,String>>  ogrenciNestedMap= new HashMap<>();
          ogrenciNestedMap.put(101,ogr101);
          ogrenciNestedMap.put(102,ogr102);
          ogrenciNestedMap.put(103,ogr103);

        System.out.println(ogrenciNestedMap);

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciNestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti
             ) {
            System.out.println(each);

        }
        ogrenciNestedMap.get(102).get("isim");


    }
}
