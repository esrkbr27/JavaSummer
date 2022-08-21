package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        //Bir tamsayı ve bir char değişkeni oluşturun ve bunların toplamını yazdırın

        int sayi=8;
        char harf='a';
        String str="banan";

        System.out.println(sayi+ harf); // 105 yazdırdı. char int gibi işlem gördü
        System.out.println(sayi*harf); //776 yazdırdı. char int gibi ,işlem gördü
        System.out.println(str+ harf); // banana yazdırdı. char string gibi işlem gördü
        System.out.println(harf+2); // 99 yazdırdı. char int gibi işlem gördü.
        System.out.println(str+sayi+harf); //banan8a yazdırdı.String hepsinden baskın olduğu için char string gibi işlem
        /* gördü.
          /*
        1- char data turu isleme girdigi degiskenin turune gore farkli davranabilir
           eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
            sayi+harf  sayi variable'i int oldugundan harf variable'i asci tablosundan 97 degerini kullanir
            char yeniHarf = harf+2;  java once sagdaki islemi yapar, sagda int + char gorunce asccii degerini alir ve sonucu 99
                                     sonra atama islemi yapmaya calisir
                                     char yeniHarf=99;
                                     bu atama java acisindan kabul edilebilir degildir
         2- str+harf); // banana String variable cok gucludur, hangi data turu ile isleme
                          girerse girsin diger data turunu kendine benzetir


         */ // peki... konsolda verilen variable'lari kullanarak 8a gormek istersek nasil yazdirmaliyiz ?

        System.out.println(""+ sayi+harf); // Başa boş bir string ifade koyarsak hepsinden güçlü olduğu için hepsi
        // string gibi davranır.





    }
}
