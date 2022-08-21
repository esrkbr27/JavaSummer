package day43_Interfaces_Iterotors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //list deki tüm elemanları index kullanmadan 3 artırın.
        for (int each:list
             ) {
            each+=3;
            System.out.print(each+3+" ");

        }

        System.out.println(list);// yukarıda 3 ekledim ama atama yaplmadıgı için kalıcı olmaz.

        /*
        Java index yapısı olamayan collection lardaki elementlere ulaşmak ve değiştirmek,
       için Iterator interfaceini oluşturmuştur.

       Iteraor ınterface oldugundan ondan obje üretmemiz mümküün değidir.
       Bunun yerine bize Iterator döndüren liste.Iterator metodunu kullanıyoruz.

         */

        System.out.println(list);

       Iterator it1=list.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
    //    System.out.println(it1.next());
       //30 dan sonra element kalmadıgından mext() RTE verir.

        /*
        Iterator da geri dönüş yoktur, adım adım sona ulaştıktan sonra
        yeniden basa gelmek isterseniz yeniden bir Iterator oluşturmak gerekir.
         */

        Iterator it2=list.iterator();

        //yeni it2 yi kullanarak listenin tüm elemanlarını silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(list); //Iterator ile elementeleri gezip remove yapınca liste değişti.

        //listeyi doldurduk.
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("yeniden liste "+ list);


        Iterator it3=list.iterator();

        while(it3.hasNext()) { //yanında eleman kalmayıncaya kadar devam et.
            it3.next();
            it3.remove();
        }
        System.out.println("looptan sonra list"+ list);

        /*
        görüldüğü gibi iterator kullanarak yapabildiğim ;

        1-tum collection ın elementlerini yazdirmak
        2-tum collection ın elementlerini silmek

        Bu da bize yetmez.
         */
    }
}
