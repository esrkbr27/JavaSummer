package day43_Interfaces_Iterotors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    /*
    ListIterator Iteratorın interface ının child intrfacedir.
    ama daha cok metoda sahiptır.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        Object temp;
        ListIterator lit1=list.listIterator();

        while(lit1.hasNext()) {
            temp=(Integer)lit1.next();

            lit1.set(temp);

        }

    }

}
