package day14_methodCreatıon;

public class C04_MethodCreatıonReturn {
    public static void main(String[] args) {
        //verilen isim ve soyismi ilk harfi büyük geriye kalanları * olacak şekilde değiştirip bize bu halini
        //döndüren bir method oluşturun.
        //Not: Programın tamamının databaseınde ve ilerleyen kısımlarında isim ve soyismi bu şekilde kullanmak istiyoruz.

        String isim="Enes";
        String soyisim="Bozkurt";
        String gizliİsim=gizliİsim(isim,soyisim);
        System.out.println(isim+ " "+soyisim); // "Enes Bozkurt" yazdırıyor.
        System.out.println(gizliİsim);


    }

    public static String gizliİsim(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+ " "+soyisim);
        return isim+  " "+soyisim;
    }
}
