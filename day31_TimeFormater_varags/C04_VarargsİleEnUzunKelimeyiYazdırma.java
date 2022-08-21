package day31_TimeFormater_varags;

public class C04_VarargsİleEnUzunKelimeyiYazdırma {
    public static void main(String[] args) {

        euzunKelimeyiYazdır("Ali","Ayse","Ismaıl","Ahmet","Babayigit");
    }

    public static void euzunKelimeyiYazdır(String ...kelime) {//varargs arrayının elemanı kac olursa olsun
        String enzunKelime=kelime[0];

        for (String each:kelime
             ) {
            if(each.length()>enzunKelime.length()) {
                enzunKelime=each;
            }

        }
        System.out.println("enzunKelime = " + enzunKelime);

        //varargs özellik olarak list gibi calışır fakat arka planında esnek yapılı blir array gibi calısır.
    }
}
