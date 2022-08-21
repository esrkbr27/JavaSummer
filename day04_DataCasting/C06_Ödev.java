package day04_DataCasting;

public class C06_Ödev {
    public static void main(String[] args) {

        //soru1) byte variable oluştur sırayla widening yap

        byte num=32;
        System.out.println(num); //32 yazdı
        short num2= num;
        System.out.println(num2);// 32 yazdı.
        int num3= num2;
        System.out.println(num3);// 32 yazdı
        float num4= num3;
        System.out.println(num4);//32.0 yazdı
        double num5= num4;
        System.out.println(num5);// 32.0 yazdı

        //soru2) int variable oluştur, narrowing yap

        int deger= 43;
        short deger1=(short) deger;
        System.out.println(deger);
        byte deger2= (byte)deger1;

        int numb= 128;
        short numb1= (short)numb;
        System.out.println(numb1);//128 yazdı
        byte numb2= (byte) numb1;
        System.out.println(numb2);

        //soru3) float data türünde variable yazdır

        float number= 1.2f;

        System.out.println(number);// 1.2 yazdırdı.

        //soru4) double 255.36 int byte çevir.

        double no=255.36;
        int no1= (int) no;
        System.out.println(no);//255.36 yazdı
        byte no2= (byte) no1;
        System.out.println(no2);//-1 yazdı

        // soru5) int 2 sayıyı biribirine bölün ve sounucu yazdırın.

        int sayi1= 47;
        int sayi2= 23;

        System.out.println(sayi1/sayi2);// 2 yazdırdı, virgülden sonrasını sildi.

        //soru6) int sayıyı double böl sonucu yazdır.

        int x=55;
        double y= 12.2;

        System.out.println(x/y);// 4.508...sounucu double olarak yazdırdı.

        //soru7) farklı data türleri ile işlem yapın

        char harf= 'y';
        int a= 23;

        System.out.println(a+y); //35.2 yazdırdı y nin ASCII değerini aldı.




    }


    public static class C05_Pre_Postİncrement {

        public static void main(String[] args) {

            int sayi1 =10;
             int sayi2= sayi1+1; // 11
            /*
            pre veya pst increment veya decrement sadece ++ ve -- için geçerlidir.
            bu iki işlem sayıdan sonra veya önce yazılmasına göre farklı iki işleyiş olur.

             */
            int sayi3= sayi2++; // sayi2 1 artırılacak, sayi2 değeri sayi3 e atanacak

            int sayi4= ++sayi1; //sayi1 1 artırılacak, sayi4 değeri sayi4 e atanacak

            System.out.println(sayi4);

        }
    }
}
