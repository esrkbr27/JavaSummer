package day35_InheritancedaConstructorOluşturma;

public class MMatematikçiler extends LOgretmen{

    MMatematikçiler () {
        //super(); bizi parent classtakı parametresize götürür.-->
        System.out.println("MMatematikçiler parametresiz const.");

    }

        MMatematikçiler (String isim) {
        this(); //ilk satırda thıs() oldugu için super() öldü.
            System.out.println("MMatematikçiler parametreli const");

        }

    public static void main(String[] args) {

        MMatematikçiler obj1=new MMatematikçiler("Tuba");
    }

    /*
    this() constructor call içinde bulunulan classtakı
    constructorları, super() constructor call ise
    parent classta bulunan constructorları cagırır.

    this() veya super() yapısına uygun bir constructor
    bulamazsa Java CTE verir.

    constructor konusunda gördüğümüz this.
    o classtaki instance variablelları gösteriyor
    inheritance da da super. vardır.
    super. da parent classtakı instance variablelları gösterir
     */


}
