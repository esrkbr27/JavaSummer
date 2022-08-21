package day30_Immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String  mi YOKSA StringBuilder mi daha hızlı?
        bunun için bir string oluşturup 1000 kere sonuna . ekleyelim
        öncesinde ve sontasında zamanı alıp aradakı farkı bulalım.

        aynı sekılde StringBuilder için de yapalım.
         */
        LocalTime baslangıc=LocalTime.now();
        String str="Ah Java";
        for (int i = 0; i <10000; i++) {
            str += ".";

        }

        LocalTime bitis=LocalTime.now();

        System.out.println(baslangıc);
        System.out.println(bitis);

        System.out.println("String zaman:"+(bitis.getNano()-baslangıc.getNano()));


        StringBuilder sb = new StringBuilder("Ah Java");
        for (int i = 0; i <10000; i++) {
          sb.append(".");

        }



        System.out.println(baslangıc);
        System.out.println(bitis);

        System.out.println("StringBuilderzaman:"+(bitis.getNano()-baslangıc.getNano()) );





    }
}
