package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F01 {

    public static void main(String[] args) {
        /*
        1) Lambda Functional Programming Java 8 ile kullanılmaya baslamıştır.

        2)Functional Programming 'de ne yapılacak (what to do?) üzerine yoğunlaşılır.
        Structred Programming; nasıl yapılacak? (how to do) üzerine yoğunlaşır.

        3)Functional Programming; Arrays ve Collections ile kullanılır.
        4)entryset(); metodu ile map sete dönüştürülerek Functional Programming de kullnılır.


         */
//1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
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

        listElemanlariniYazdirStructred(list);
        System.out.println();
        listElemanlariniYazdirFunctional(list);
        System.out.println();
        System.out.println("Structred");
        ciftElemanlariYazdirStructred(list);
        System.out.println();
        System.out.println("Functional");
        ciftElemanlariYazdirFunctional(list);
        System.out.println();
        tekElemanlarinKareleriYazdir(list);
        System.out.println();
        tekElemanlarinKupleriniTekrarsizYazdir(list);
        System.out.println();
        TekrarsizciftElemanlarinKupununCarpiminiYazdir( list);
        System.out.println();
        getMaxEleman(list);
        System.out.println();
        getYedidenBuyukMinimum( list);
        System.out.println();

    }

    public static void listElemanlariniYazdirStructred(List<Integer>list){
        for (Integer w:list) {
            System.out.print(w+" ");
        }


    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t-> System.out.print(t+ " "));

        /*
        stream() metodu collectiondan elemanları
        akısa dahil etmek için ve metotlara ulaşmak için kullanılır.

        t-> lambda exprection
         */


    }

    //2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructred(List<Integer> list){
        for (Integer w:list) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }

    }
    //2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t -> System.out.println(t+" "));

        /*
        Buradaki filter if görevini görüyor,filterdan gecen
        yandakı forEach içine girer, filtreden gecemeyen forEach e giremez.

        filter metodu kullanmak için stream() kullanmak sarttır.
         */
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriYazdir(List<Integer> list1){
        list1.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));

       //elemanların değeri değişecekse map metodu kullanılır.(map) değiştir demek
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer>list){
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));

        /*
        distinct metodu elemanları uniqe hale getirir.
        bir listte aynı olanlardan sadece 1 tanesini almayı saglar.

        basa koyarak kodun calışmasını hızlandırdık,
        basta aynı olanları cıkardı, filtreye daha az eleman girmesini sagladı.
         */
    }
//5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizciftElemanlarinKareToplaminiYazdir(List<Integer> list){ //[64,100,4] reduce kadarkı halı bu
      Integer toplam=  list.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(0, Integer::sum);
        System.out.println(toplam);

        /*
        reduce metodu coklu eleman olan bir listi teke indirmek için kullanılır (reduce düşür demek)
        listedeki kare olan degerleri toplayıp tek bir deger olarak yazdırmak istiyorum

        0 baslangıc degeri olarak koyduk,(sonucu etkilememsi için 0)
         t ye önce 0 koydum, u ise listedeki ilk deger geldi (64)
        0+64 =64 toplam 64 oldu 0 ın yerine gecti identy:64 oldu
        64+100=164 toplam oldu 64 yerine identy:164 oldu
        164+4=168 toplamı Integer toplam variableına atadık, istersem int da yapabilirim.

         */
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void TekrarsizciftElemanlarinKupununCarpiminiYazdir(List<Integer> list){

      Integer carpim=  list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t,u)->t*u);

        System.out.print(carpim);

        //for each kullanmaya gerek yok, çünkü tek deger reduce ile yazdırılacak
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list2) {
//1. yol;
    Integer max=    list2.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
    Integer max1=    list2.stream().distinct().reduce(list2.indexOf(0),(t,u)->t>u ? t : u);

    //distinct yaparsam aynı olanı bastan cıkarıp modun calışmasını hızlandırmış olurum.


        System.out.println(max);
    }
//2.yol;
    public static void getMaxEleman1(List<Integer> list2){

       Integer MAX=list2.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("MAX = " + MAX);

        //küçükten BÜYÜĞE sıraladıgı için en sondaki deger en büyük olur,
        //(t,u)-> u diyerek yanındakını al diyoruz.
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    //1. yol
    public static void getYedidenBuyukMinimum(List<Integer> listx){

      Integer min= listx.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println("min = " + min);

    }

    //2. yol;

      public static void getYedidenBuyukMinimum2(List<Integer> listx){

      Integer min1=  listx.stream().
              distinct().filter(t-> t%2==0).
              filter(t-> t>7).
              sorted(Comparator.reverseOrder()).
              reduce(Integer.MAX_VALUE,(t,u)->u);

          System.out.println(min1);
      }

      //3. yol
    public static void getYedidenBuyukMinimum3(List<Integer> listx){

       Integer min= listx.stream().
               distinct().
               filter(t-> t%2==0).
               filter(t-> t>7).sorted().
               findFirst().
               get();

       //findfirst() ; ilk elemanı bulma
        System.out.println(min);
    }


//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getterssiralamatekrarsizelemanlarinyarisi(List<Integer> list){

      List<Double> listy =  list.stream().distinct().filter(t-> t>5).map(t-> t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        /*
        data tipi büyük olan hangisi ise sonucu da double olarak yazdırır.
        Bu nedenle /2 yerine /2.0 yazarak ınt daouble cevirmiş oldum.

         reverseorder() metodu ile sortu terse ceviriyoruz,Comperator classını kullanarak static metod oldugu için
         class ismi ile cagırdık.
         */


    }



}

