package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        //Listlerde eleman eklemenın diğer yolları;

        //1. yol add metodu;

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        //2. yol Arrays.asList metodunu kullanarak

        List<String> ikinciyol = Arrays.asList("Ali","Ayse","Ismaıl","Ahmet","Babayigit");
        System.out.println(ikinciyol);

        //3.yol: List of metodunu kullanarak
        ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

        sayilar1.size();  // int kapasite döndürür.stringdekı length görevini yapar.

        System.out.println("listenın boyutu: "+ sayilar1.size());

        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); // 4 elemanlı[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("listenın boyutu: "+ sayilar1.size());


        //set metodunda ilk parametre indexi,2. parametre ise o index yerine silip koyacagımız degeri verir.
        sayilar1.set(2,8); // ındexı 2 olan sayıyı silip yerine 8 koyacak.[5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayilar1);
        System.out.println(sayilar1.set(0,12)); // 5 yazdırdı.
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2]

        //set metodu istenen indexdekı eskı elementı slıp yerıne verdıgımız yenı elementı set eder.
        //eger eskı elemntı sılmek istemıyorsak  add (index,deger) metodu kullanabiliriz.

      // set() metodu sıldıgı eskı elementı bıze gerı döndürür.
    }
}
