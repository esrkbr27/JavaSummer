package day32_StringBuilder;

public class C08_equalse {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true,
        /*
        StringBuilder DA EQULASE  metodu aynı obje aynı deger olursa true döner
        String DEKI gibi içerik aynı olursa esit olur diyemeyız.
         */
        System.out.println(sb1.equals(str));//false
        //normalde iki farklı obje karsılastrılamaz,ama biri StringBuilder
        //digeri String olursa herzaman false döner

        System.out.println(sb1.compareTo(sb2));
        //tüm karakterler biribir ile aynı 0 fark var

        StringBuilder   sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));//-4
        /*
        compareTo metodu iki StringBuilder metodu bastan baslayarak
        harf harf karsılastırır.ilk harfler aynı ise ikincilere gecer.
        ikinciler aynı ise ucunculere gecer ve ilk farklı olan harfe kadar gider.
        faklı olan iki harfin ASCII kodları arasındakı farkı verir.

        eger hiç farklı harf yoksa sonuc olarak 0 döndürür.
         */
    }
}
