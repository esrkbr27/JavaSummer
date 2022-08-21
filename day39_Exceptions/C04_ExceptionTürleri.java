package day39_Exceptions;

public class C04_ExceptionTürleri {
    public static void main(String[] args) {

        String str;

        /*
        System.out.println(str);
        Deger ataması yapmadan bir variableı kullanamya calısırsanız
        Java bunu Compile Time da farkederse size izin vermez.
         */

        str=null;//str ye hiçbirdeger koymadın.belki ilerde deger ataması yapılır diye compile time vermez.
        System.out.println(str);
       // System.out.println(str.length());//run timeda hata anlaşılır.
        /*null
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        at day39_Exceptions.C04_ExceptionTürleri.main(C04_ExceptionTürleri.java:16)

        //NullPointerException runtime exceptionda cıkan bir hatadır.*/

        Object obj="Java Java Java"; //Object classı en kapsamlı classdır,tüm classlar onun childıdır.

        Integer sayi=(Integer) obj;/*obje daha geniş oldugu için direk yazılamaz.
        Bu durumda ClassCastException verir.*/
        System.out.println(sayi);
/*Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at day39_Exceptions.C04_ExceptionTürleri.main(C04_ExceptionTürleri.java:25)

        /*
        String str2="Hava civa";
        Integer sayi2=str2;

        Java bazı casting işlemlerine compile timeda izin vermez.
        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calışmasına itiraz etmez.
         */




    }
}
