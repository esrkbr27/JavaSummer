package day44;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTürü {
    public static void main(String[] args) {


      LinkedList ll1=new LinkedList();

      List<String> ll2=new LinkedList(); //List linked listın parentıdır.

        Queue ll3=new LinkedList();

        Deque<String> ll4=new LinkedList();

        ll2.add("Berk");
        ll2.add("Döne");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);
        System.out.println(ll2.remove(3)); //"Ayse" yi sildi bana sildigini yazdırır.
        //Eger listemiz int elementlerden oluşuyorsa direk sayi yazarsak index olaral kabul eder,
        //ama bir variablea atar ve remove da o variableın ismini yazarsak obje olarak kabul eder.
        System.out.println(ll2.remove("Kemal"));//Kemal listede yok false döndürür.
        ll2.set(1,"Ali"); //1. indexdeki isim değişti.

        ll1.add("Berk");
        ll1.add("Ismail");

        ll2.retainAll(ll1);//ll1 de olmayan tüm elementleri ll2 de silr
        System.out.println(ll2);
        System.out.println(ll2.hashCode());//codeun referans numarasını yazdırır.

    }
}
