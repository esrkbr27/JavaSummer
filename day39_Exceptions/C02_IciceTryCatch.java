package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IciceTryCatch {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");
            int k;
            while ((k=fis.read()) != -1) {
                //fis. read() metodu dosyayı karakter karakter okutur.harf bitince -1 döndürür.
                System.out.print((char) k);

            }



        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı ");
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadı.");
        }
        /*
        bu obje yazılınca deniyor ki; şu objenın yolunda bir dosya var, onu koduma dahil et
        java der ki bu yolda bu dosya var mı, dosya bozuk mu bilemem,bu belirsizliği çözmek için
        2 sekilde çözeriz
        ya try catch ya da throws EXception İLE ÇÖZERİZ.

        ilk catch ile alttaki catch biribirinden bagımsız ise,
        sıranın bi önemi yoktur.

        Biribirinin parent childi bir hata türü varsa sıralama önemlidir.
        FileNotFoundException IOException dan daha kapsamlı
        oldugu için yukarda olması gerekir
         */

    }
}
