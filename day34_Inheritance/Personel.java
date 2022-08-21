package day34_Inheritance;

public class Personel {

    /*
    eger parent class olacak sekilde tasarladımız
    bir class varsa veya ilerde bu classı parent yapmak
    isteyenler olabilir diyorsanız variable ve metotların
    access modifierını protected secmelisiniz

    protected sayesinde child classlar parent classları nerde
    olurlarsa olsunlar,(farklı package da olsa bile)
    ulasabilirler.

    protected public gibi değilidr,bu variablellara
    sadece parentler ulaşabilir.
     */

   protected   int persNo;
   protected String isim="İsim belirtilmedi";
   protected String departman="Departman belirtilmedi";


    public void maas () {
        System.out.println("Tum personelin maası vardır.");
    }

    public void mesai(){
        System.out.println("Tum personel statüsüne göre mesai yapar.");
    }
    public void fazlaMesaiucreti(){
        System.out.println("personel fazla mesai ücreti alır.");

    }





}
