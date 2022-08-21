package day44;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTürü {
    public static void main(String[] args) {
        Deque<String> ll4 =   new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);
        System.out.println(ll4.pop());

    }

}
