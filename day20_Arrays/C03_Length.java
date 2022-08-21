package day20_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        //iki şekilde Array oluşturabiliriz
        int sayilar[]={1,2,3}; //degerleri yazark atama

        String harfler []=new String [4]; //uzunlugu yazarak atama

        System.out.println("sayilar Arrayının uzunlugu :"+ sayilar.length); //arrayde lengthden sonra parantez yok

        String isim="Java";
       // isim.length(); //stringde lengthde parantez var

        System.out.println("harfler Arrayının uzunlugu :"+ harfler.length); //array
        System.out.println(Arrays.toString(harfler));

        //harfler Arrayının son elementini yazdıralım.
        System.out.println(harfler[harfler.length - 1]); //Arrayın son indexindekı elementı verir.

        System.out.println(harfler[5]);//.ArrayIndexOutOfBoundsException
    }
}
