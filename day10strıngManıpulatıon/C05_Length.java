package day10strıngManıpulatıon;

public class C05_Length {
    public static void main(String[] args) {
        String str = "Java ogren,isi kap";

        // length strıng ifadededeki karakter sayısını verır(bosluk dahıl)saymaya 1 den baslar
        //charAt ise char karakter dondurur.index sayısını yazdıgın karakterı sana yazdırır.Bu cumlede son
        //harfın indexi 17 (0 dan basladıgı için) yazarsan p dondurur.
        System.out.println(str.length()); // 18 characters var.(1 den baslayarak saydı.)
        System.out.println(str.charAt(17)); // p, cunku charAt 0 dan baslayarak sayar.

        /*sayamayacagımız kadar uzun karaktere sahıp strıng ifadelerde bu ıfadenın son harfını bulmak için
        son ındex numarasını bılmem lazım,tek tek saymak mumkun olamayacagı için dıyebılırız ki
        son index numarası= (ifadenın ength degeri-1)
         */

        System.out.println(str.charAt(str.length() - 1)); //bu ifade asagıdakı ile aynıdır. son karakterın ındexını buldu
        System.out.println(str.charAt(17));

        //sondan 3. karakterı yazdır deyınce;

        System.out.println(str.charAt(str.length() - 3)); // k yazdırdı.

        //javada null poınter bir deger degil,karsısına yazıldıgı varıablın hıc bir deger almadıgının isaretcisidir.

        String str2 = null; // deyınce str2 ye hıc bir deger atanmamıs demektır.

        System.out.println(str2.length()); // Exceptıon yazdırdı.Bir deger yok kı sayayım dedı.

        String str3 = ""; // deyınce str3 e hıclık degeri atanmıs demek
        System.out.println(str3.length()); // 0 DONDURUR.Hiçligin içnde 0 karakter var.
    }
}
