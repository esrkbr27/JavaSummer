package day12_stringManıpulatıon;

public class C03_substring {
    public static void main(String[] args) {

        String isim= "Suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3));// eyman (0 dan başla 3. index dahil yazdır)
        System.out.println(soyisim.substring(5));//fil (0 dan başla 5. index dahil yazdırır.)
        System.out.println(soyisim.substring(soyisim.length()-3));//yukardaki ile aynı

        System.out.println(isim.substring(2,4));// le 2. index dahil saymaya başla 4. indexe kadar 4 dahil değil


        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String ilkHarf=isim.substring(0,1).toUpperCase();
        String geriyeKalanlar=isim.substring(1).replaceAll("\\w","*");
        String soyisimİlkharf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyekalan=soyisim.substring(1).replaceAll("\\w","*");


        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";

    }
}
