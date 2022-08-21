package day18_whileDoWhile;

public class C01_whıle_doWhıle {
    public static void main(String[] args) {
         /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
                Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf; //whıle loopun içinde sürekli artırdıgımız için bozmamak adına ilk harfi temp e  atadık.
        String buyult="";


        while(temp<=sonHarf){

            buyult= (temp+"").toUpperCase();

            System.out.print(buyult + " ");
            temp+=1;
        }

    }
}
