package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
       split metodu Bir array metodu degıl,strıngmetodudur.Array döndürdüğü için bu konuda ele alınır.
       split ile herhangı bır strıngı ıstedıgımız sekılde parcalara bolup bır array halıne getiriyoruz.
         */
        String str="Java ne kadar guzel";
        String []kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, ne, kadar, guzel] boslukları kaldırır,otomatik virgul koyar.


        String []kelimelerNe=str.split(" ne");
        System.out.println(Arrays.toString(kelimelerNe)); //[Java,  kadar guzel]


        String []kelimelere=str.split("e");//[Java n,  kadar guz, l]
        System.out.println(Arrays.toString(kelimelere)); //


        String []karakter=str.split("");
        System.out.println(Arrays.toString(karakter));//[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]

    }
}
