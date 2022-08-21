package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[] = new int[3];

        System.out.println(sayilar); //[I@58372a00 ,sayilar dizisninin referansını bize yazdırdı stake memorydekı
        //non primitivre data türündekı dataları her zaman direk yazdıramayız.
        //arryi yazdırmak istersek javadakı Arrays classından yardım alırız

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(sayilar);//[I@58372a00
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10] index sırasına göre


        String sınıfList[] ={"Ali", "Ayse", "Ahmet"};

        System.out.println(Arrays.toString(sınıfList));//[Ali, Ayse, Ahmet]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        /*
        arrayin içindeki degeri degişebilirim,ancak lengthi degişemem.
         */

        System.out.println(Arrays.toString(sayilar));//[5, 3, 10]

        sınıfList[1]="Hasan";

        System.out.println(Arrays.toString(sınıfList));//[Ali, Hasan, Ahmet],Bunların hepsi bir array,
        // "Hasan" bu arraydakı bir String oldugu için sadece Hasan yazdırmak istersem string olarak yazdırırım.

        System.out.println(sınıfList[1]);
        System.out.println(sınıfList[0]);
    }

}