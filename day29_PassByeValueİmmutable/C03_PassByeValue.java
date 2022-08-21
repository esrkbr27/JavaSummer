package day29_PassByeValueİmmutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByeValue {
    public static void main(String[] args) {
        /*
        bir list oluşturalım iki ayrı metottan birinde sadece elemaları degiştirelim
        diğerinde yenı bir list atayıp aynı sayıda yenı eleman ekleyelım ve her iki metod calldan sonra
        kendı listemızı maın metodda kontrol edelım
         */

        List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("ilk basta list"+list);

        elemanlarıDegıstır(list);

        System.out.println("elemanlarıDegıstır metodundan sonra listemız"+list);
        System.out.println("elemanlarıDegıstır metodundan sonra listemız"+list);

        listDegıstır();
        System.out.println();
    }

    public static void listDegıstır() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("elemanlarıDegıstır metodunda"+list);


    }

    public static void elemanlarıDegıstır(List<String> list) {
        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("eleman degıstır metodunda listemız: " + list);
    }
}
