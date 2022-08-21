package day15_Overloading;

public class C01_methodCreatıon {
    public static void main(String[] args) {
        // verilen iki sayıyı carpıp bıze dödüren metodu yazınız.(döndüren diyorsa return, yazdır diyorsa void)

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1, sayi2); //carpGetir ==methodcallla maın metoda gideriz
        System.out.println("illa da sonucu göreyim diyenlere.."+ sonuc);// asagıda da returnin önunde yazsan da
        //calışır.
    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;

        return sonuc;// return kelimesi sonucu main metoda gönderiyor.
        //veya
        //int sonuc=sayi1*sayi2; return sonuc; seklınde de yazılabilirdi.


    }
}
