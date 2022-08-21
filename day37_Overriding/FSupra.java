package day37_Overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanır.");
        /*
        Private metotlar override edilemez.

        Eger child classta parent classtaki private metot
        ile aynı signature da bir metot oluşturursanız
        bu overriding metot olmaz.
         */
    }

    @Override //notasyon
    void motor() {

        /*
       @override notasyonu javaya bir görev verir.
       java bu notasyonla birbirine baglı olan iki metodu sürekli kontrol eder.
       eger parent classtakı overriden metodu silerseniz @Override notasyonu CTE verir.

       @Override notasyonu kullanmak mecburi değildir.
       Eger overriding metot silinirse kodun CTE vermesini
       istersek override notasyonu kullanmalıyız.
         */

    }
}
