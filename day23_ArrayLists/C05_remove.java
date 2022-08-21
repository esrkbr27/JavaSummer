package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println(sayilar1); //[5, 3, 2]


        sayilar1.add(1); //[5, 3, 2,1]

        sayilar1.remove(1) ; // [5,2,1]
        System.out.println(sayilar1);
        /*
        sayılardan oluşan bir list varsa java remove metodunda sayi yazdıgımızda direk ındex olarak kabul eder.
        burda indexi 1 olan 3'ü kalıdırır.

        5i silsin istiyorsam ;
       1. silinecek degeri bir obje olarak(Wrapper class) bır varıable atarım.
       (Çünkü listin içine sadece obje yazılabilecegı için wrapper class dan faydalandık.)

       2.indexof metodu ile silecegım degerin indexini bulup o indexi remove yaparım

         */
        //1. yol
        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);


        //2. yol sayilar1=[2,1] oldu
        sayilar1.remove(sayilar1.indexOf(2)); // 2. indexi sildim
         System.out.println(sayilar1); //[1]



    }
}
