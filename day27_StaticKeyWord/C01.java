package day27_StaticKeyWord;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*class levleda iki türlü variable oluşturabiliriz.

        static variablalların diger adı class varıable dır.
        instance variablellara da obje variable diyebiliriz.

        STATIC VARİABLELLAR tüm classran kullanılabilirlen
        instance olanlar statıc olmayam metodlardan DİREK kullanılabilir.
        instance variablellara statıc metottan ulaşmak istersek
        obje oluşturmamız gerekir.

        İNSTANCE varıablellar obje varıable oldugu için herhangi bir satırda
        insatance varıableın ne oldugunu bulmak için OBJE OLUŞTURULAN
        satırdan itibaren kod incelenmelidir.

        STATIC varıablellar class varıableı oldugu için
        herhangi bir satırda satatıc varıableın degerini bulmak için
        CLASSIN  basından itibaren kod incelenmelidir.
         */

        C01 obj1=new C01(); //obje oluşturdum.
        System.out.println("obj1.rakam = " + obj1.rakam);
        System.out.println("obj1in sayi degeri: "+sayi); //statıc varıable obje oluşturmadan da cagrılabilir.
                                                         //oluşturarak da kullanılabilir

       // rakam+=1; rakam instance varıable oldugu için direk ekleme burda yapılmaz, ancak obje ile yapılır.
       obj1.rakam+=1;
       sayi+=1;  //obj1.sayi++; da denebilirdi.

        System.out.println("1 artırdıktan sonra rakam degeri:"+obj1.rakam); //6
        System.out.println("1  artırdıktan sonra sayi degeri:"+obj1.sayi); //11

        C01 obj2=new C01(); //yenı obje oluşturduk.
        System.out.println("obj2.rakam degeri = " + obj2.rakam);//5
                                                        // obje oluşturulduktan sonra rakama atama yapılmış mı?
                                                        //  o zaman instance varıable da atama yapılmış mı? evet
                                                                //o zaman instance varıable degerini yazdırır.
        //instance varıable ın takıbı objeyı oluşturdugum yerden baslar.

        System.out.println("obj2 nin sayi degeri: "+sayi);
        //statıc varıable ın takıbı classtan en bastan kontol ederk baslar.
        //35. satırda sayi degerini 1 artırdık 11

        obj2.rakam++; //5+1=6 (claas leveldan rakamın degerini aldım,
        // bir yere ugramadan direk classa geldim artırmayı yaptım

        obj2.sayi++;  // 11 +1 =12 olur.

        System.out.println("1 artırdıktan sonra rakam degeri:"+obj2.rakam); // 6 Obj2 oluşturldugu yerden baslıyorum
        System.out.println("1  artırdıktan sonra sayi degeri:"+obj2.sayi);//12 classın en basından geldim






    }
}
