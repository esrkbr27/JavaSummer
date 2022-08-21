package day35_InheritancedaConstructorOluşturma;

public class Child extends BParent {
    //Child claası extends keywordu ile BParent classını parent edindi,
    //BParent da AGrandparents ı parent edindiği için multi inherirance özellikten
    //dolayı Child class hem BParent hem de AGrandparents I parent edinmiş olur.

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child klübü";

    Child(){
        //önce parent classların constructorı calışır.sonra buraya döner
        System.out.println("Child constructor caıştı.");
    }

    public static void main(String[] args) {
        AGrandparents gp1=new AGrandparents(); //Bu objeyi oluşturdugumuzda AGranparents constructor calışır.
        //Parent veya Child constructor calışmaz.

        Child child1 = new Child();//kendı classımızdan obje oluşturduk.
        child1.grandpaKlupAdı="Child1";
        child1.parentKlupAdı="child2";

        //child1 objesi için Child() constructor calıştı.
        /*
        javada bir classı kullanabilmek için
        o classtan obje oluşturur, dolayısıyla o classın
        constructorını kullanırdık.

        Java inheritanceda parent classlardakı
        özellikleri kullanabilmek için o classların
        constructorlarını otomatic calıştıran bir yapı kurmuştur.

        ornegın biz child classında kendı classından bir obje
        oluşturmak istedimizde Child() constructorını kullanırız.

        Java Child() constructorını GÖRDÜĞÜNDE önce parentın constructorını
        calıştırmam lazım der
        buradan parent constructora gider.
        Parent Classında Parent() constructorını GÖRÜNCE önce bunun parentının
        yanı Granparents ın constructorını calışması gerekir der.

        Böylece extends keyword olmayan classa kadar gider
        oradan baslayarak tüm constructorları asagı doğru calıştırır.

         */


    }
}
