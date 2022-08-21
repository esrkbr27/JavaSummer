package day22_MultıDımensıonalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        Tek katlı Arraylerde Array direk yazdıramıyoruz.cunku Array non primitive data ürüdür ve her non primitive data
        direk yazdırılamayabilir.

       Ancak Arrayın içerisindekı elementler direk yazdırılabilir.cunku genelde primitive data türü veya String data
        türü elementler kullanılıyordu.

        MultıDımensıonalArraylerde en dikkat edecegımız konu ulaşmak istediğimiz elementin bir Array mı yoksa
        primitive mı oldugudur.

        Arrayın kac katlı oldugunu basta ve sondakı suslu parantez sayısına bakarak söyleebiliriz.
         */

        int[][] sayilar={{1,2,4,5},{3,4}};

            //burada sayılar arrayını dusunursek içinde 2 tane inner Array var.sayılar[0] deyince

        //sayilar[0] --> [1,2,4,5] vermesi mı gerekır.HAYIR!! cunku Bu bir dizi oldugu için direk referans numarasınıı
        //yazdırır elementleri değil
        //ancak en içerdeki elementlere ulaşırsak direk yazabiliriz.


        System.out.println(sayilar[0]); //referans yazdırır.
        System.out.println(Arrays.toString(sayilar[0])); //ilk elementi verir outer arrayın

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]); //3


        System.out.println(Arrays.toString(sayilar)); //iki arrayın referansını verir.
        System.out.println(Arrays.deepToString(sayilar)); //[[1, 2, 4, 5], [3, 4]] //dizilerin kendısını yazdırmak istiyorsak
        // deepto_string metodu kullanmalisiniz
        /*
        Arrayı ıkı sekılde deklere edebiliyorduk
        1. elemanları direk yazark
            int[][] sayilar= {{1,2,4,5},{3,4}};

         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar= new int[3][4];


         ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz
         */



    }
}
