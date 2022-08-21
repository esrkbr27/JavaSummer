package day17_NestedForLoop;

public class C01_nestedForLoop {
    public static void main(String[] args) {

        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input="Java her zaman guzel";

        tekrarsızInput(input);

    }

    public static void tekrarsızInput(String input) {
        /* benzersiz harfleri içine koyacagımız bir varıable oluşturduk.
        verilen stringi ilk indexden baslayarak tek tek inceleyip farklı harfi buldugumuzda  benzersiz input
        varıableına koyacagız.
         */
        String benzersizİnput="";
      //  Verilen stringdekı boşluk ve özel karakterleri önce cıkararak üzerinde harfleri arayacagımız inputa ceviriyoruz.
        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
      //Benzersizİnput a önce ilk harfı koyacagız.bunun için substring ile ilk harfi alıp yazdırıp,varıable ekliyoruz.

        System.out.print(islenecekKelime.substring(0,1));
        benzersizİnput+=islenecekKelime.substring(0,1);// J yi benzersizİnputa koyduk.
        /*
        J yi aldıktan sonra tek tek karakterleri inceleyecegız,kelimenın sonuna kadar.Burda döngüyü kullanabiliriz.
        i 1. indexden baslayıp(0 degil,cunku ilk karakteri sepete koyduk.) işlenecekkelimenin length ine kadar arayacak

         for (int i = 1; i <islenecekKelime.length()  ; i++) {
                    islenecekKelime.substring(i,i+1) (1,2)den kalan kelimeden baslayacak karakterlere bakmaya
                                                     (2,3)
        }
        AMAAA... arama yaparken her defasında kontrol etmemiz gereken bir sey var.Benzersizİnput ta bu harf var mı yok mu
        harf yoksa ekleyecek, varsa bir sey yapmayacak eklemeyecek.

        *** bunu yapmak için diyecegız kı benzersizİnputta işlenecekkelime(i,i+1) var mı yok mu?..
         yoksa benzersizİnputa koy (burda if devreye girer.! basına yazark yoksa demiş oluyoruz.)
         */

        for (int i = 1; i <islenecekKelime.length(); i++) {
            if(!benzersizİnput.contains(islenecekKelime.substring(i,i+1))) {
                System.out.print(","+ islenecekKelime.substring(i,i+1));
                benzersizİnput+=islenecekKelime.substring(i,i+1);
            }
            }
        System.out.println("");
        System.out.println("input: " + input);
        System.out.println("output: " + benzersizİnput);

        }




}
