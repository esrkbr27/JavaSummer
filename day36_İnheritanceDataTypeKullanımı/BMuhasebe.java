package day36_İnheritanceDataTypeKullanımı;

public class BMuhasebe extends APersonel {

    protected int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Personel minimum :"+(30*gunlukMesai*saatUcreti)+"maas alır.");
    }

    protected void ozelSigorta(){
        System.out.println("İsteyen calısanlara %50 indirimli özel sigorta yapılır.");
    }
}
