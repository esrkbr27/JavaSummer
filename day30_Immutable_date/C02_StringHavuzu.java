package day30_Immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiçlik="";
        String str4=str1.concat(hiçlik);

        System.out.println(str1==str2); //false
        System.out.println(str1.equals(str2)); //true tamamen içerige bakar.

        //== hem degerın aynı olmasına hem de referansının aynı olmasına bakar.

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false

        System.out.println(str2.equals(str4));//true tamamen içerige bakar. Ali Can
        System.out.println(str2==str4);//false

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str4.equals(str1));//true tamamen içerige bakar. Ali Can
        System.out.println(str4==str1);//true

        System.out.println(str1.equals(str6)); //true tamamen içerige bakar
        System.out.println(str1==str6);

        /*
       1--> String yeni bir String oluşturuken esıtlıgın sagında "new" keywordu olursa
       java direk yeni bir obje ve referansı olusturur.

       2-->Eger esıtlıgın sagında bir metot calışıyor veya (+)
     işlem yapıyorsa strıng immutable oldugu için
     java kaydetmek üzere bir kopya String ve ref oluşturur,
     sonra degeri hesaplayıp bu yeni kopyayı objenın içine koyar.
     Bu nedenle içerik aynı olsa bile java bunları farklı objelerde sakladıgı için,
     referansı degıstirir.

      3-->Eger yenı String obje oluşturulurken new kelımesı kullanılmaz veya
      esıtlıgın sagında bir işlem olmazsa java eger daha önce
       oluşturulan objelerden (String Havuzu)
       birebir aynı strıng varsa o objeyı ve referansını
       kullanır.
       Birebir aynısı yoksa yeni bir obje ve yeni bir referans oluşturur.

             */

        System.out.println(str5.equals(str6)); //true
        System.out.println(str5==str6);//true
    }
}
