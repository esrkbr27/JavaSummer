package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        int[] sayilar={5,7,1,9};


        //Arrays Classını kullanarak natural (sıralı) hale getirebiliriz.

        Arrays.sort(sayilar); //arrayde yaptıgımız degısıklıgın kalıcı olması için bir varıablea atamaya gerek yoktur.
                              //bu seklıyle kalıcı olarak degısıklık yapılmış olur.

        System.out.println(Arrays.toString(sayilar));//[1, 5, 7, 9] sıraladı.


    }
}
