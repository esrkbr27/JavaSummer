package day21_Arrays;

public class C01_ArraysMaxSayıyıBul {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar = {3,5,7,1,4,9,5,2};

        maxSayıyıYazdır(sayilar);
    }

    public static void maxSayıyıYazdır(int[] sayilar) {

        int maxSayi=sayilar[0];//deger atamasını kafamıza göre yazamayız.ilk elemanı önce koyduk,diger degerlerle karsılastırarak
        //bir öncekını sılıp buyuk olanı alıyoruz.0 yazmadık çünkü degerler negatif olsaydı bu sayıların hıcbırır 0 dan buyuk olmadıgı
        //için max degeri bulamayız.
        for (int i = 1; i <sayilar.length; i++) {//0. indexi yukarda deklere ettıgım ıcın 1 den dönguyu baslattık.
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }


        System.out.println("Arraydakı en buyuk sayi: "+ maxSayi);


    }
}
