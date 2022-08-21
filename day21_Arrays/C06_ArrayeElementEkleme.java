package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElementEkleme {
    public static void main(String[] args) {
        //C05 dekı metodu kullanarak eleman ekleyelım

        String [] takımListesi={"Suleyman","Osman"};
        String eklenecekİsim="Talha";
        takımListesi=C05_ElementEkle.elemanekle(takımListesi,eklenecekİsim);// bu takım listesinin yenı halını döndurecek.

        System.out.println(Arrays.toString(takımListesi));

    }
}
