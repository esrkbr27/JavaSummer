package day33_Encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tülay");
        System.out.println(ogr1.getIsim());
        /*
        Bu yöntemde data hiding değil
        daha anlaşılır bir kod amaçlanmış olur.
         */
    }
}
