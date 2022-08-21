package day33_Encapsulation;

public class Ogretmen {
   private String isim;
   private String soyisim;
   private String brans;

    /*
    Bazen de yetkileri sınırlamak değil de yapılan işi daha iyi tanımlamak için
    encapsulation kullanılır.

    Bu yaklaşımı kullanan classlarda tüm varıablellar private yapılıp
    hepsi için getter ve setter oluşturulur.
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
