package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class F03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        BüyükHarfİleYazdir(liste);
        System.out.println();
     //   BüyükHarfİleYazdir2(liste);
        UzunlugaGöreYazdir( liste);
        System.out.println();
        uzunlugaGöreTersSirala( liste);
        System.out.println();
        sonKaraktereGöreSirala(liste);
      //  bestenbüyüklerisil(liste);
      //  baslangıcıAyadasonuNolaniSil( liste);
        System.out.println(uzunlugu12denazMi(liste));
        System.out.println(xileBaslamiyorMu(liste));
        System.out.println("rileBitenVarmi( liste) = " + rileBitenVarmi(liste));
    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    public static void BüyükHarfİleYazdir(List<String> list ){
//1.yol
        list.stream().map(String::toUpperCase).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

   /* public static void BüyükHarfİleYazdir2(List<String> list ){
//2.yol
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */
//2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun

    public static void UzunlugaGöreYazdir(List<String> list) {

        list.stream().sorted(comparing(String::length)).forEach(utils::ayniSatirdaBosluklaYazdir);

        //Comparator comparing sıralama koşulunu belirtmek için kullanılır.
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGöreTersSirala(List<String> list) {
        list.stream().sorted(comparing(String::length).reversed()).
                forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGöreSirala(List<String>list){
        list.stream().distinct().sorted(comparing(utils::sonkarakter)).
                forEach(utils::ayniSatirdaBosluklaYazdir);

        //comparator.comparing(); içine hangi koşula göre sıralama yapmak istiyorsam onu yazarım
        //thenComparing() :==>siralam icin bir kosul daha belirtir

    }

    public static void uzunlukVeIlkHarfeGöreSiralaYazdir(List<String>list){

        list.stream().sorted(comparing(String::length).
                thenComparing(utils::ilkkarakter)).forEach(utils::ayniSatirdaBosluklaYazdir);

    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

 //   public static void bestenbüyüklerisil(List<String> list){

    //    list.removeIf(t-> t.length()>5);

        //stream() metodundan sonra remove metodu olmadıgı için stream kullanmadık.
        /*
        list mutable oldugu için elemanları işlem sonrası
        kalıcı değiştiğinden comment out yapıyorum
         */

//7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

 //   public static void baslangıcıAyadasonuNolaniSil(List<String> list){

        //1. yol;
      //  list.removeIf(t-> t.charAt(0) == 'A'|| t.charAt(0) == 'a' ||
      //          t.charAt(list.size())-1 == 'N'||t.charAt(list.size())-1 == 'n');

      //  System.out.println(list);

        //removeIf içerisine silme koşulu yazılır, bu sartı sağlayanı siler.


   // public static void baslangıcıAyadasonuNolaniSil2(List<String> list){

    //2. yol;  list.removeIf(t-> t.startsWith("A")|| t.startsWith("a")||
    //           t.endsWith("N")|| t.endsWith("n"));
    //   System.out.println(list);

        //removeIf içerisine silme koşulu yazılır, bu sartı sağlayanı siler.


    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.

    public static void uzunlug8ile10arasiOilebitenisil(List<String>list){
    list.removeIf(t-> t.length()>7 && t.length()<11 || t.endsWith("o"));
    System.out.println(list);


}

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

 public static boolean uzunlugu12denazMi(List<String> list){

      return  list.stream().allMatch(t-> t.length()<12);

      //allMatch metodu listedeki tüm elemanların sart saglayıp saglamadıgını kontrol eder.
 }

 //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xileBaslamiyorMu(List<String> list){

       return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rileBitenVarmi(List<String> list){

        return list.stream().anyMatch(t-> t.endsWith("r")||t.endsWith("R"));
    }

}