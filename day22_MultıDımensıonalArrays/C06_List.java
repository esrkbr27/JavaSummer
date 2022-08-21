package day22_MultıDımensıonalArrays;


import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        //arrayı array yapan sembol [] dür.
        //arraylistte ise <> diamond (elmas)kullanırız.

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        //BİR liste eleman eklemek istersek
        isimler.add("Basak"); //boolean döndürür.ekldin mı eklemedın mı mutlaka döndürür zaten süreklı true döndürür.

        System.out.println(isimler.add("Ayse")); // true doner
        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman //listte atama yapmaya gerek yok
         */
        System.out.println(isimler); // atama yapmadıgımız halde isimleri yukarda ekledıgımız ıcın geldi[Basak, Ayse]
        /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */

    }
}
