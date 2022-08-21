package day29_PassByeValueİmmutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByeValue {
    public static void main(String[] args) {

        /*
        4 elemanlı bir array oluşturalım
        sonra ayrı bir metotta bu arrayın ıkıncı ve dördüncü elemanlarını
        100 den küçük rastgele bir sayı ile değiştirelim.
        ve yeni halini yazdırın
         */

        int[] arr={5,7,8,10};

        elemanDegıstır(arr);
        System.out.println("main metodun içinde diger metot calıştıktan sonra"+ Arrays.toString(arr));
    }

    public static void elemanDegıstır(int[] arr) {

        Random rnd = new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println("metotun içinde"+Arrays.toString(arr)); //[5, 34, 8, 26]
    }
}
