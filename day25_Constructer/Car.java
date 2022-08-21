package day25_Constructer;

public class Car {
    /*
    BU class bizim kalıphanemız.
    bir araba oluşturmak için ihtiyacımız olan varıable ve methodları
    bu classta belirleriz.

    sonra farklı classlarda araba oluşturmamız gerekırse
    bu classdan bir obje oluşturup burada belirlenen varıable
    ve bu methoda göre araba üretir.

     */

      String marka="Marka belirtilmedi"; //marka girilmezse default olarak bunu yazdıracak
     String model="Model belirtilmedi";//model belirtilmedigı için default olarak bunu
    public int yıl;
    public int fiat;

    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahıptır.");
    }

    public void maxHız(int hiz){
        System.out.println("Bu araba max "+ hiz+" km yapar.");

    }
}
