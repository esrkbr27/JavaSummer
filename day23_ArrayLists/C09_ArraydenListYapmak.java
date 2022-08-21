package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        list ile calısırken en kötü özelliği elemanları tek tek eklemektir.

         */

        Integer[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

        /*
        bu kadar cok elemanlı bir listeyı tek tek eleman olarak gırmek yerıne
        array oluşturup forloop ile oluşturdugumuz liste tasıyabilirz
         */

        List<Integer> sayilar = new ArrayList<Integer>(); //(!! Listin içine obje yazmak zorunda oldugum için int
        // yazamadım,wrapper class yaptım.)

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        /*
        bu işlemı yapması için javanın oluşturdugu bir metotta var
         ancak bu yontemı cok yan etkısı var.Bu yan etkiler;
         1-->bu şekilde oluşturulan listede add, remove gibi size ı degiştiren metodlar
         kullanılamaz
         2-->asList metodu ile oluşturulan liste ve kaynak olan array birbiri ile ilişik olarak
         hayatlarına devam ederler.birinde yaptıgımız degısıklık otomatık olarak
         dıgerıne de işler.


         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2);


        sayilar.add(5);
        System.out.println(sayilar);

       /* sayilar2.add(5);
        System.out.println(sayilar2); exceptoın*/

        arr[0] =20;
        System.out.println(Arrays.toString(arr)); //arrayde update yapabılırız.

        System.out.println("arrayde degısıklık yapınca :"+ sayilar2);
    }
}
