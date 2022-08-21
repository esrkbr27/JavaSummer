package day31_TimeFormater_varags;

public class C05_VarargsParametreİleKullanma {
    public static void main(String[] args) {
        euzunKelimeyiYazdır(5,"Ayse","Ismaıl","Ahmet","Babayigit");//argümentler,asagıdakıler parametre
        /*
        varargs teorik olarak sonzuz sayıda element alabilir.Bir metottta parametre olarak varargs varsa
        varargsın sınırlarını bilebilmesi için parameterlerin sonuncusu olmalıdır.
        Öncesinde farklı parametreler olabilir ama varargs dan sonra parametre olamaz.

        Bu kuraldan ötürü bir metotta sadece 1 tane varags olabilir.
         */
    }

    public static void euzunKelimeyiYazdır(int kelimeSayisi,String ...kelime) {//varargs arrayının elemanı kac olursa olsun
        String enzunKelime=kelime[0];

        for (String each:kelime
        ) {
            if(each.length()>enzunKelime.length()) {
                enzunKelime=each;
            }

        }
        System.out.println("enzunKelime = " + enzunKelime);
    }
}
