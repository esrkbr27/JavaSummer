package day31_TimeFormater_varags;

public class C03_VarargsİleToplama {
    public static void main(String[] args) {
        //verilen kac tane int olursa olsun
        //hepsini toplayıp sonucu yazdıran bir metot oluşturun.
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        ToplaYazdır(sayi1, sayi2,sayi3,sayi4);
        ToplaYazdır(sayi1, sayi2);
        ToplaYazdır(sayi1, sayi2,sayi3);
        ToplaYazdır(sayi1, sayi2,sayi3,sayi4,sayi5);


    }

    public static void ToplaYazdır(int... sayi){
        /*
       int... Bu gösterim int variablellardan oluşan bir varargs demektir.
       Varargs array altyapısını kullanır.

         */
        int toplam=0;
        int sayiadedi=sayi.length;

        for (int each:sayi
             ) {
            toplam+=each;        }
        System.out.println("girilen"+sayiadedi+" sayilarin toplamı: " + toplam);

    }
}
