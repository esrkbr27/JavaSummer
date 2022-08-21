package day41_Abstruct_Inteface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {
 /*
 Abstract parent silsilesinden gelen ilk
 concrate class parent olan tm classlardaki
 abstract tüm metotları concrete (override) etmek zorundadir.

  Bu kuralın istisnası parent classlardan hehnagi birinde
  concrete hale dönüştürülmüş abstract metotlardır.
  */
 public static void main(String[] args) {

     HA160 arb1=new HA160();
     //concrete bir classtan istediğimiz bir objeyi üretebiliriz.

     FMercedes arb2=new FMercedes();
     //mercedes de concrete

   //  EToyota arb3=new EToyota();
       EToyota arb4=new GCorolla();
     //Abstract classlar constructor barındırır ama obje üretemezler.
     //Toyota classı abstract class oldugundan obje üretilemez.

    /*
     List<String> list = new List<String>();
     List<String> list2 = new ArrayList<String>();
     Abstract bir classın özelliklerini tasıyan bir
     obje oluşturmak istediğimizde data türünü
     istediğimiz abstract class,constructorı ise childı olan concrete
     bir classtan seceriz.
     */
 }

}
