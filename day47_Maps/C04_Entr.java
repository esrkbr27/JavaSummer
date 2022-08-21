package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entr {
    public static void main(String[] args) {

        /*
        Java Entry <key, value> mapin içinde bulunan
        herbir kaydı key=value seklinde tutar,
        dolayısıyla herhangi bir entrye ulaştıgımızda
        hem keye hem de valueya ulaşabilir ve istediğimiz
        işlemleri yapabiliriz.

        entry.getKey() bize keyi getirir
        entry.getValue() bize value getirir.
        entry.setValue() valueyu istediğimiz deger olarak update eder.

         */

        Map<Integer, String> sinifListmap = ReusableMethods.mapOlustur();

        System.out.println(sinifListmap);

        //Mapın herbir elemanını alt alta yazdırın.

       Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListmap.entrySet();

        for (Map.Entry<Integer, String> each:sinifEntrySet) {
            System.out.println(each);
        }

        //map içerisindeki tüm elemanlarında varsa tester ismini QA olarak değiştirelim

        String eachValue;

        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("tester","QA");
            each.setValue(eachValue);
        }

        System.out.println(sinifListmap);
    }
}
