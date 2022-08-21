package day29_PassByeValueİmmutable;

public class C04_İmmutableClass {
    public static void main(String[] args) {

        /*
        immutable: degıstırılemez
        mutable: degıstırılebilir.


        en meshur immutable class :String

         */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//YİLDİZ BANK

        str.toLowerCase();//bu satırda kuculdu ama alt satıra gecince bi degısıklık olmaz,atama yapmadıgımız için
        System.out.println(str);

        str.substring(3,5);//di sout olunca yazdırır.

        System.out.println(str);

        // Javada String gibi metin ifadelerde kullanabilecegımız mutable
      //  StringBuilder classı da vardır.Bu classta atama yapılmadan da degısım yapılabilir.

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);

        sb.reverse(); //ters cevir metodu
        System.out.println(sb);//knaB avaJ

        sb.append(".");
        System.out.println(sb);//knaB avaJ.


    }
}
