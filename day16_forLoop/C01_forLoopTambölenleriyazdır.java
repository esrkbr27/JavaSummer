package day16_forLoop;

public class C01_forLoopTambölenleriyazdır {
    public static void main(String[] args) {


        //verilen bir pozitif tamsayının tam bölenlerini yazdıralım.

        int input=20;


        for(int i=1; i<=20; i++) {
            if(input%i==0) { //verilen sayıyı 1 den başlayıp i ye böldüğümüzde kalan 0 olan sayılar tam bölünen sayılardır.
                System.out.print(i+" ");
            }
        }
    }
}
