package day11strıngManıpulatıon;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        //herhangı bır strıng veya charın ilk kullanıldıgı indexi bize dondurur.
        System.out.println(str.indexOf('g'));// 6

        System.out.println(str.indexOf("r")); //7

        System.out.println(str.indexOf("j")); //-1 kucuk j yok diyor.

        System.out.println(str.indexOf("mek")); //10 mek bir bütün düşünür m

        //eger istedıgımız ındexden sonrasını kontrol etmek istersek aynı metodu iki parametereli olarak yazarız
        // (fromındexof kullanarak) istenen karakterın indexını bulduktan sonra bu ındexden sonra o karakterın olup
        //olup olmadıgını ındexı bir artırıp aratarak bulabılırız.

        System.out.println(str.indexOf("g",(6+1))); //6  yazılan index den itibaren g harfı kacıncı ındex de onu verır.


        // yukardakı str dakı a ve e nın indexlerini bulun.
        int ilke=str.indexOf("e");
        int ikicie=str.indexOf("e",ilke+1);
        if (ikicie==-1){
            System.out.println("verilen str da 2.e yok");
        }else{
            int ucuncue=str.indexOf("e",ikicie+1);
            if(ucuncue==-1){
                System.out.println("verilen str da 3.e yok");
            }else{
                System.out.println("verilen str da 3.e nın index'i: "+ ucuncue);
            }
        }
    }
}

