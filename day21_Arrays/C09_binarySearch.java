package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        //Bınary search metodu sıralanmış arrayde aradıgımız elementın
        // ı döndurur.
        //[String de indexOf bıze olmayan elementler için -1 donduruyordu]

        /*
        Aradıgımız element arrayde yoksa Java hem olmadıgnı hem de olsaydı nerede
        olacagını bıze döndürür.
        olmadıgını ifade için - kullanır
        olsaydı nerede olacagını belirtmek için index degıl sıralama kullanır.
         */

        int [] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[3, 4, 7, 10, 15, 27]
        //varsa index yoksa - sıra

        System.out.println(Arrays.binarySearch(sayilar,4));// 1

        System.out.println(Arrays.binarySearch(sayilar,15)); //4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5 döndurur.(1 den basladık saymaya indexden degıl)

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3 döndurur.

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1 döndurur.
    }
}
