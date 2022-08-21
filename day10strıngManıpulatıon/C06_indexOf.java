package day10strıngManıpulatıon;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        //istedıgım karakterın Strıng ıfadede kacıncı ındex de oldugunu bana verır.
        //olmayan bır karakterın ındexını soarasam bana -1 dondurur.

        System.out.println(str.indexOf("o")); //5

        System.out.println(str.indexOf('g')); //6

        System.out.println(str.indexOf("t")); // -1 bana ınt döndürecek, int yok diye bir deger yok
                                              //0 dersek "j" nın indeksi olur.negat,f bir deger dönerse bız bu aranan
                                              //strıngın str da olmadıgını anlarız.java -1 dondurmeyı tercıh etmıstır.

        System.out.println(str.indexOf("mek"));// blok halınde arar, varsa ilk harfının indexını verır.

        String str5="wjdjfısdjfşdgşggtgjohkşgşdfşh";
        if (str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanılmamıs");
        }else{
            System.out.println("str5 de istenen karakter kullanılmıs");

        }

    }
}
