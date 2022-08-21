package day42_AbstractClasses_Interface;

public interface I03_Interfaces {

    int SAYİ=20;

    /*
     int sayi;

     interfacelerde tüm variablellar public,static ve final dır.
     sonradan değer atama sansımız yoktur,bunun için variable
     oluşturduğumuzda mutlaka değer atamalıyız.

     Bir interface bir classı parent edinemez.
     */
    void yakit();
    /*
    interface içerisindeki her metot
    public,abstracttir.

    abstract bir metodun bodysi olması mümkün değildir.
    java sonradan dev. istegi üzerine kısmi bir update yapmıştır.
    bir interface sonradan bir abstract metot eklerseniz
    o interfacei daha önce implement etmiş tüm classlara gidpi hepsinde yeni
    eklenen metodu override etmeniz gerekir
    bu da eskıden gelen projeler için cok zor bir işlemdir.
    bunun için java8 den itibaren interfacelere sonradan bodysi olan metot eklenmesine
    izin vermiştir.Bu metotların bodysi olsa da interfacein yapısı gereği bu metotlara
    concrete denmez bu bodysi olan metotlar istisna olarak kabul edilebilir.


     */

    public void  motor();
    public abstract void teker();

    static public void akü(){

    }




}
