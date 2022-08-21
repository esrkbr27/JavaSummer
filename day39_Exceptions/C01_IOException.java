package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        //bu metot calışırken FileNotFoundException fırlatabilir.mesajını yukarda throws ile verdik.

        /*
        Javada bilgisayarımızdaki bir dosyaya ,
        erişmek istiyorsak FileİnputStream classından
        yardım alırız.
        Aynı şekilde Java'dan bilgisyarımızdaki bir
        dosyaya ekleme veya update yapmak istersek
        FileOutputStream classından yardım isteriz.
         */

        FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");
        /*
        Görüldüğü gibi Compile Time da altını kırmızı çizen
        her durum Compile Time Eror değildir.

        Java da bazı exceptionlarda Compile Time Exceptiondur
        özellikle dosya okuma ve yazma ile ilgili
        exceptiolar   Compile Time Exceptiondır.

        Compile Time  Exception oluştugunda java çözüm olarak
        2 sey önerir

        1.try-catch ile cevrelemek
        2.metot signatureına throws keywordu ile
        beklenen exception türünü yazmak

        throws exception sadece olayın farkında
        oldugumzun deklarasyonudur.
        Exceptionın handle(bertaraf) edilmesinde hiçbir rolü yoktur

        yani try catch ile handle ettiğimiz (kontol altına aldığımız)
        exceptionlarda kod calışmaya devam ediyordu
        Ancak throws exception yazdıgımızda java bir exception
        ie karşılaştıgımızda hiçbir sey yapılmamış gibi hata mesajı
        yayınlayıp calışmayı durdurur.

         */


    }
}
