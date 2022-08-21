package day29_PassByeValueİmmutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByeValue {
    public static void main(String[] args) {
        /*
        Birden fazla element içeren array ve array list gibi
        yapılarda da PassByeValue gecerlidir.

        eger met
         */

        /*
        verilen 4 elemanlı bir arrayı
        metota gönderelim,metotta yeni 3 elemanlı bir array atayıp
        bu yenı arraye rastgele 100 den kucuk 3 sayı atayalım
        metodda arrayı yazdıralım

        main metodda da metod call dan sonra yeniden metodu yazdıralım.
         */

        int[] arr={3,5,8,10};

        arrayiDegıstır(arr);
        System.out.println("main metodda array"+ Arrays.toString(arr));//main metodda array[3, 5, 8, 10]
        System.out.println(arr);//[I@2d98a335
        //bu arr ile metoddaki arrayin referansı farklı oldugu için metoddan gelenı kabul etmedı
    }

    public static void arrayiDegıstır(int[] arr) {

       arr= new int[3];
       Random rnd= new Random();
       arr[0]=rnd.nextInt(100);
       arr[1]=rnd.nextInt(100);
       arr[2]=rnd.nextInt(100);
        System.out.println("metodda array"+ Arrays.toString(arr)); //metodda array[83, 71, 26]
        System.out.println(arr); //bu arrayın referansı[I@5fd0d5ae
    }
}
