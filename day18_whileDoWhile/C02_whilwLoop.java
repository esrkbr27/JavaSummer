package day18_whileDoWhile;

public class C02_whilwLoop {
    public static void main(String[] args) {


        int input = 5432;
        int rakamlarToplamı = 0;
        int birlerBasamagı = 0;
        int temp = input; //10 a bölünce ilk sayı kaybolmasın

        //bu işlem basamak sayısı kadar yapılır. burda 4 defa


        while (temp > 0) { //girilen input 0 a varıncaya kadar 10 a böl.>=0 olursa sonsuz döngü olur.
            birlerBasamagı = temp % 10;
            rakamlarToplamı += birlerBasamagı;
            temp /= 10;
        }
        System.out.println(input + " sayısının rakamlar toplamı :" + rakamlarToplamı);
    }
}