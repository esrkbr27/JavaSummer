package day24_ArrayListForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {
    public static void main(String[] args) {

        String[] arr={"İsmail","Nurullah","Fatih"};
        /*
        uzun listeler oluşturmamız gerektıgınde tek tek eklemek yerine
        array oluşturup bunları liste cevirmek daha pratık olabilir.
        1.loop ile arraydekı tum elemanları liste alabiliriz
        2. Arrays.asList() metodu kullanabiliriz.
        Ancak bu metodun iki yan etkısı var.
        - Arrays classı kullanıldıgı ıcın array özellikleri gecerli olur.
        dolayısıyla listte olan add remove gibi sıze ı degıstıren metotlar
        bu sekılde oluşturlan listlerde kullanılmaz.
        -kaynak olan array ıle urun olan lıst özdeşleştirilir.
        birinde yapılan değişiklik otomatik olarak dıgerine de işlenir.


         */

        List<String> sınıflistesi= Arrays.asList(arr);

        System.out.println(sınıflistesi); //[İsmail, Nurullah, Fatih]


        /*1. yan etkı(arrayden cevridiği için listın metotlarını kullanamıyoruz.)

        sınıflistesi.add("Erdi"); //listte add kullanabilirim yazımda sıkıntı yok ama calıştırınca
        UnsuprotedOperatıon Exceptıon hatası veriyor.

        sınıflistesi.remove(1); //1. indexdekı "Nurullah" ı silmem lazım,ama hata veriyor.

        2. yan etkı */

        arr[1]="Emre";//arrayı değiştiriyorum, listte değişiyor
        System.out.println("degişim sonrası array"+Arrays.toString(arr));
        System.out.println("arrayı değiştirince list:"+ sınıflistesi);

        //listi değişiyorum array de değişiyor.
        sınıflistesi.set(0,"Utku");
        System.out.println("Listi degişince sınıf listesi: "+sınıflistesi);
        System.out.println("lisi degişince array:"+Arrays.toString(arr));


    }
}
