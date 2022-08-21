package day15_Overloading;

public class C02_Overloadıng {
    public static void main(String[] args) {
        //javada oluşturdugumuz metodların isimlerinin yaptıgı işler ile uyumlu olmasını isteriz.
        //bir stringin bir bölümünü almak için2 adet substring() metodu kullanırız.
        //verilen stringdekı bazı parcaları yenileri ile değişmek için 2 adet replace() metodu var.
        //Java aynı isimde birden fazla method varsa hangisinin kullanacagına parametre sayısı ve parametrelerin data
        //türüne göre karar verir.

        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.substring(3,4);
        str.replace('c', 'j');
        str.replace("J","j");


        //Aynı isimde ama farklı metodları oluşturmak için değiştirebilecegimiz seyler;
        //1. Parametre sayısını değiştirebilirsiniz.
        //2. Aynı sayıda parametreye sahıp olsa bile parametrelerin data türelirini değiştirebiliriz.
        //3.Aynı sayıda ve aynı data türlerinde olan parametreleri olan metodlarda parametrelerin sırlanışı

    }
}
