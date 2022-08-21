package day14_methodCreatıon;

public class C03_MethodDeclaratıon {
    public static void main(String[] args) {
        // Input olalarak verilen isim ve soyismi ilk harfi büyük, geriye kalan harfler * olacak şekilde
        //İ*****, H****** şeklinde method oluşturun.
        String isim="Enes";
        String soyisim="Bozkurt";


        ismiGizle(isim,soyisim);



    }

    public static void ismiGizle(String isim, String soyisim) {

       isim= isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w","*");
       soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+ " "+soyisim);
    }
}
