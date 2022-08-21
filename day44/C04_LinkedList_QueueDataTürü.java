package day44;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTürü {
    public static void main(String[] args) {

        Queue ll3=new LinkedList();

        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("HPolat");
        ll3.add("Kadir");

        //Queue Kuyruk demektir, sıra önemlidir,gelen sona gelir,giden(silinen) bastan gider.

        System.out.println(ll3);

        System.out.println(ll3.remove()); //Adem

        System.out.println(ll3);//[Zeynep, HPolat, Kadir]

        System.out.println(ll3.remove("HPolat"));//true

        System.out.println(ll3);//[Zeynep, Kadir]

        System.out.println(ll3.element());//Zeynep

        System.out.println(ll3.peek());//Zeynep

        Queue <String> ll4 = new LinkedList<String>();

        System.out.println(ll4.element());//throws Exception fırlatır. eger liste bos ise

        System.out.println(ll4.peek());//liste bos ise null döndürür.

        /*
        element() ve peek() silmeden ilk elementi
        bize döndürür.
         */

        System.out.println(ll3.offer("Ahmet"));//sona ekliyor.

        System.out.println(ll3.poll());//ilk elemanı silip döndürür.



    }
}
