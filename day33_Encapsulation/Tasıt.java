package day33_Encapsulation;

public class Tasıt {

   private String tasıtTuru;
   private boolean muayenesiVarMı;
   private int yil;

    public String getTasıtTuru() {
        return tasıtTuru;
    }

    public void setTasıtTuru(String tasıtTuru) {
        this.tasıtTuru = tasıtTuru;
    }

    public boolean isMuayenesiVarMı() {
        return muayenesiVarMı;
    }

    public void setMuayenesiVarMı(boolean muayenesiVarMı) {
        this.muayenesiVarMı = muayenesiVarMı;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
