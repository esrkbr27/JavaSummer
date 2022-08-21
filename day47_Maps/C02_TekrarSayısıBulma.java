package day47_Maps;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class C02_TekrarSayısıBulma {
    public static void main(String[] args) {

          String str= "Heeeeellllooooo Woooorrrrllllllddddd.";
            str=str.replaceAll("\\W","");

          String[] harflerArr=str.split("");

        System.out.println(Arrays.toString(harflerArr));
        //harfleri key, kullanım adedini value yapalım.

        Map<String,Integer> harfKullanimSayiMap=new Hashtable<>();

         int harfKullanimSayi;
        for (String each:harflerArr) {
                if(!harfKullanimSayiMap.containsKey(each)) {
                    harfKullanimSayiMap.put(each,1);
                }else {
                      harfKullanimSayi=harfKullanimSayiMap.get(each);
                      harfKullanimSayiMap.put(each,++harfKullanimSayi);
                }
        }
        System.out.println(harfKullanimSayiMap);
    }
}
