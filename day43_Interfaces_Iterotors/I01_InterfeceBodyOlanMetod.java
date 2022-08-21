package day43_Interfaces_Iterotors;

public interface I01_InterfeceBodyOlanMetod {

    void motor();

    public void yakit();

    public abstract String akü(); //public abstract yazmaya gerek yok, yazsan da yazmasan da public abstracttır.
  /*
  normal bir clssta oldugumzu düşünürsek
  iki tane access modifier kullanma ihitimali olamaz.

asagıdaki methodda göreceğiniz gibi
interface de istisnai olarak bodysi olan
metotlar oluşturulabilir.

bu özellik java 8 den sonra kullanılmaya baslamıstır.
 bir interfacee yeni bir metot eklememiz
gerektiğinde eskiden beri bu interfacei implement eden tüm classlara gidip
yeni eklenen metodu override etmemiz gerekirdi.

bu özellik sayesinde basına default veya static keyword ekleyerek
interfacede yeni ve bodysi olan bir metot oluşturursak
bu metodun child classlar tarafından override edilme mecburiyeti olmaz.

eskiden implement etmiş classları değiştirmemiz gerekmez.

Bu istisnai bir durumdur ve interface için gecerli olan kuralları bozmaz.
Bu metodların bodysi olsa da bunlara concrete metot denmez ve
override edilme mecburiyeti yoktur.

buradakı default kelimesi access modifier değilmistisnai durumun belirtilmesi içindir.
o zaman niçin iki keyword(static ve default) tanımlanmıştır?
bu iki farklı kelimenin amacı child classlardan bu metoda nasıl erişilebilecegini
belirlemek içindir.
Static keyword kullanılırsa child classlardan bu metotlara
erişmek için Interface adı.metotadı yeterli olur.

default keyword kullanılırsa metoda erişmek için obje oluşturulmalıdır.

   */

    public default void teker(){
        System.out.println("default...tüm arabaların tekeri vardır.");
    }


    public static void direksiyon(){
        System.out.println("static...tüm arabaların direksiyonu vardır.");
    }
}
