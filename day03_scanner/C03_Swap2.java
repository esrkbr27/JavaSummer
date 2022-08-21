package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        //sayıların farkından yararlanarak swap uygulama
        int sayi1=10;
        int sayi2=20;

        sayi1= sayi1-sayi2; //sayi1 in değeri -10 oldu. -10 u kullanarak sayi1i 20, sayi2 yi 10 yapacağım.
        sayi2= sayi2+sayi1; // sayi2 nin değeri artık 10 oldu yani sayi1 in değerine eşit oldu.
        sayi1= sayi2- sayi1;// sayi 1in değeri artık 20 oldu. burda sayi1 yerine -10 sayi2 yerinede 10 yazdık.

        System.out.println("swaptan sonra sayi1 :" + sayi1);
        System.out.println("swaptan sonra sayi2 :"+ sayi2);

        // sayıların toplamları kullanılarak swap yapma
        sayi1= sayi1+ sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;

    }
}
