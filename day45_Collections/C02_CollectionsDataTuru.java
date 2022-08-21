package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {


        /*
        Collections <data türü> nu Object secmeniz durumunda collectiona
        farklı data türelerinden objeler koymanıza izin verir
        Bu depolama acısından bize esneklik saglar,ancakişlem
        yaparken tüm objeleri Object olarak tanımladıgımızdan
        cok fazla casting yapmamız gerekebilir.
         */



        List<String> liste = new ArrayList<String>();
        //  liste.add(5);
        // liste.add('s');
        //  liste.add(true);

        List<Object> list = new ArrayList();
        list.add(5);
        list.add(true);
        list.add('s');
        list.add("Ali");
        System.out.println(list);//[5,true,s,Ali]

       list.set(0,(Integer)list.get(0)+5);
       list.set(3,list.get(3)+"Can");
       list.set(2,(Boolean)list.get(2));


        System.out.println(list);

        Set<Object> set = new HashSet<Object>();
        set.add(5);
        set.add(true);
        set.add('a');

        /*
        Object tüm classların atası oldugu için data türü olarak
        "Object" secerseniz tüm data türü elemet ekleyebilirsiniz.
         */
    }
}
