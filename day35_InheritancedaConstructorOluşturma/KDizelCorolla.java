package day35_InheritancedaConstructorOluşturma;

public class KDizelCorolla extends HCorolla {

    KDizelCorolla() {
        System.out.println("KDizelCorolla parametresiz constructor");
    }

    KDizelCorolla(String isim){
        //burda super(); const yok cunku asagıda oluşturulmuş
     super(isim);
        System.out.println("KDizelCorolla parametreli constructor");
    }

    public static void main(String[] args) {
        KDizelCorolla OBJ1=new KDizelCorolla("hasan");
    }
}
