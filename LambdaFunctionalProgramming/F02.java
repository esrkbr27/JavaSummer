package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F02 {

    public static void main(String[] args) {
        /*
     1.   t-> "logic", (t,u) -> "logic"
        Bu yapıya lambda expression denir.

     2.FunctionalProgramming kapsamında "Lambda expression " kullanılır ama önerilmez
     "Lambda expression" yerine "Method Reference" tercih edilir.

    3.Method Reference kullanımı "Class Name : : Method Name"

    Aynı zamanda kendi classlarınızı da kullanabilirsiniz.
    Örneğin; bir animal classmınız var ve bu class "eat()" metoduna sahip==>
    "Animal :: eat"
         */
        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list); //[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(list);
        System.out.println(list);
        ciftElemanlariYazdirFunctional(list);
        System.out.println();
        tekElemanlarinKareleriYazdir(list);
        tekElemanlarinKupleriniTekrarsizYazdir(list);
        tekrarsizciftElemanlarinKareToplaminiYazdir(list);
        tekrarsizciftElemanlarinKupununCarpiminiYazdir02(list);
        getMaxEleman(list);
        yedidenBuyukciftMin(list);
        TersSiraİleTekrarsizBestenBuyukElemanlarinYariDegeri( list);
    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(utils::ayniSatirdaBosluklaYazdir);

        /*
        : : ayniSatirdaBosluklaYazdir metodunun içine girmemi sağlıyor.
        listteki elemanı al, metodun içine koy
         */


    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(utils::ciftelemanlarisec).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriYazdir(List<Integer> list) {

        list.stream().filter(utils::tekelemanisec).map(utils::karesinial).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer> list) {

        list.stream().distinct().
                filter(utils::tekelemanisec).
                map(utils::küpünüal).
                forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizciftElemanlarinKareToplaminiYazdir(List<Integer> list) {

        Integer toplam = list.stream().distinct().
                filter(utils::ciftelemanlarisec).
                map(utils::karesinial).
                reduce(0, Math::addExact);

        System.out.println(toplam);
        //addExact metodu; toplama yapar.

    }

    public static void tekrarsizciftElemanlarinKareToplaminiYazdir01(List<Integer> list) {
//2. yol
        Integer toplam = list.stream().distinct().
                filter(utils::ciftelemanlarisec).
                map(utils::karesinial).
                reduce(Math::addExact).get();

        //get kullanınca baslangıc degeri yazmama gerek yok.
    }


    public static void tekrarsizciftElemanlarinKareToplaminiYazdir02(List<Integer> list) {
        //3.yol;
        Integer toplam = list.stream().distinct().
                filter(utils::ciftelemanlarisec).
                map(utils::karesinial).
                reduce(Integer::sum).get();


        //Integer Wrapper classında sum metodu da toplama yapar
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizciftElemanlarinKupununCarpiminiYazdir02(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(utils::ciftelemanlarisec).map(utils::küpünüal).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Math::max).get();

        System.out.println(max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukciftMin(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7).filter(utils::ciftelemanlarisec).reduce(Math::min).get();

        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve
    // 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void TersSiraİleTekrarsizBestenBuyukElemanlarinYariDegeri(List<Integer> list) {

        List<Double> result = list.stream().//gerekli metodu kullanmamızı saglar
                distinct().//tekrarlı olanları almaz
                filter(t -> t > 5).//koşula göre filtreler
                map(utils::yarisiniAl).//herbir eleamnın değerini değiştirir.
                sorted(Comparator.reverseOrder()).//tersten sıralar
                toList();//elemanları liste atar.

        System.out.println(result);

    }

}