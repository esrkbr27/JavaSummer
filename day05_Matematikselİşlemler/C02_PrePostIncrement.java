package day05_Matematikselİşlemler;

public class C02_PrePostIncrement {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment :"+ ++sayi);//iki işlem var:artırma yazdırma önce artırırır sonra yazdırır. (11)

        sayi=11; // oldu yazdırdıktan sonra

        //aşagıda işleme sayi artık 11 olarak giriyor.

        System.out.println("post-increment :"+ sayi++);//önce sayıyı atar sonra artırır. (11)

        sayi=12; // oldu artık

        System.out.println("post-incrementden sonra :"+ sayi);// artan sayıyı yazdırır. (12)


        sayi++;  //13

        ++sayi; // 14




    }
}
