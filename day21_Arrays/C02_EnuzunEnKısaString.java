package day21_Arrays;

public class C02_EnuzunEnKısaString {
    public static void main(String[] args) {
      //  Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeEnKısayıYazdır(isimler);
    }

    public static void enUzunVeEnKısayıYazdır(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKısaKelime=isimler[0];

        for (int i = 1; i < isimler.length;i++)  {

            if(isimler[i].length()>enUzunKelime.length()) {
                enUzunKelime=isimler[i];
            }

            if(isimler[i].length()<enKısaKelime.length()) {
                enKısaKelime=isimler[i];
            }

        }
        System.out.println("Arraydakı en uzun kelıme : "+ enUzunKelime);
        System.out.println("Arraydekı en kısa kelime : "+ enKısaKelime);
    }
}
