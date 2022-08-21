package day11strıngManıpulatıon;

public class C06_ensWıth {
    public static void main(String[] args) {

        /*
   Soru 1) Kullanicidan email adresini girmesini isteyin,
   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

 */
        String input="fatıh@gmail.com";

        if(!input.contains("gmail.com")){
            System.out.println("lütfen gmaıl adresi giriniz");
        }else if(input.endsWith("gmail.com")){
            System.out.println("gecerli gmail girdiniz");
        }else{
            System.out.println("lütfen yazımı kontrol edın");
        }
    }
}
