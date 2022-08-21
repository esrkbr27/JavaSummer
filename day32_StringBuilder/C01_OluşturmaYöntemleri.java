package day32_StringBuilder;

public class C01_OluşturmaYöntemleri {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candır...");
        StringBuilder sb3 = new StringBuilder(10);


        System.out.println(sb1.capacity());//16
        System.out.println( sb1.length());//0

        System.out.println(sb2.capacity());//30 (14+16)
        System.out.println(sb2.length());//14

        System.out.println(sb3.capacity());//10
        System.out.println(sb3.length());//0

        //StringBuilder otomatik olarak 16 karakterlik yer ayırır.

        System.out.println(sb1.append("Java"));//append metodu ekleme yapar.


        sb1.append(" Candır");
        System.out.println(sb1.length() );//11
        System.out.println(sb1.capacity());//16

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length() ); //25
        System.out.println(sb1.capacity()); //34 (16*2+2)//aynı SB ye ekleme yaparsak kapasıteyı 2kat 2 fazlası yapar.

        StringBuilder sb4= new StringBuilder();
        sb4.append("Java Candır ");

        System.out.println(sb4.length() );//12
        System.out.println(sb4.capacity());//16


    }
}
