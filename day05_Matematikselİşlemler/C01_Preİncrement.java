package day05_Matematikselİşlemler;

public class C01_Preİncrement {

    public static void main(String[] args) {


        int sayi1= 10;
        int sayi2= sayi1 +1 ;  // sayi2--> 11
        sayi2 +=5; // sayi2-->16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
        int sayi3 = sayi2++;    // 1- sayi2 bir artirilacak,++lar sonra yazılmış.

        // buna post increment denir. o satırda yapılan iki işlemden artırma veya azaltma işlemi sonuncudur.
        // 1- sayi2 degeri, sayi3'e atanacak
        //2- sayi2 değeri 1 artırılacak

        System.out.println("sayi3 :"+ sayi3);// 16 önce sayı2 yi sayi3 e atadı, sonra artırdı.(post incrementte böyle)

        System.out.println("sayi2 :"+ sayi2); //17 post increment olduğu için  sayi2 1 arttı


        //Pre incrementte ise önce artırır sonra atama işlemi yapar.

        int sayi4=++sayi1;      // 1- sayi1 bir artirilacak
        // 2- sayi1 degeri, sayi4'e atanacak

        System.out.println("sayi4 :"+ sayi4);// 11 önce sayı1 i bir artırdı,öyle atadı

        System.out.println("sayi1 :"+ sayi1); //11 sayi1 1 arttı post increment olduğu için.








    }
}
