package day19_Scope;

public class C01_instanceVarıable {
    int instSayi=20; //statıc olmayıp class levelda oldugu için instance varıabledır.
    /*
    Class içerisinde her yerden kullanmak istedıgınız varıablelları class levelda(Classın içinde ama methodlaron
    dısında)oluştururuz.

    genellikle class level variablelar classın basnda oluşturulur.(sart degıl)

    Class leveldakı varıablellar için 2 scope vardır.
    1-Statıc variable (class varıable da denir)
    2-İnstance variable (obje varıable da denir.)
     */




    public static void main(String[] args) {

        int sayi=10;
   /*
        System.out.println(instSayi);
        instance variable satatıc olmadıgı için statıc kulube üye maın metoddan direk kullanamayız.
        instance variableların diğer adı objcet variable dır.obje oluşturusanız insantance variablelları
        her yerde kullanabilirisiniz.
    */
        C01_instanceVarıable obje1=new C01_instanceVarıable();
        System.out.println("obje1 degısmeden önce :"+obje1.instSayi); // 20 yazdırdı.
        obje1.instSayi=30; //obje1 ın degerini burda degiştik.
        System.out.println("obje1 degısdıkten sonra :"+obje1.instSayi);//  30 yazdırdı


        C01_instanceVarıable obje2=new C01_instanceVarıable();
        System.out.println("obje2 degısmeden önce :"+obje2.instSayi);//20 yazdırdı,30 degil,yeni obje oluşturunca
        //en basa gider o degeri alır.
        obje2.instSayi=25;
        System.out.println("obje2 degısdıkten sonra :"+obje2.instSayi);//25 yazdırdı


        C01_instanceVarıable obje3=new C01_instanceVarıable();
        System.out.println("obje3 degısmeden önce :"+obje3.instSayi);

        /*
        her obje oluşturuldugunda obje variableının ilk atanan degerini alır.
         */



    }


    public static void staticMethod(){
     //   System.out.println(sayi);
        // bir methodun içinde oluşturulan variable sadece o methodun içinden kullanılabilir.(Local variable)

     //   instSayi=30;
        /*
        istance varıablellara main metod dısındakı statıc metotlardan da dırek ulasamayız.
        obje oluşturusak ulaşabiliriz

         */
        C01_instanceVarıable obje4=new C01_instanceVarıable();
        System.out.println(obje4.instSayi);


    }



    public  void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        instance variablellar class içerisindeki statıc olmayam metotlardan dırek kullanılabilir.
         */


    }
}
