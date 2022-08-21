package day25_Constructer;

public class CarRunner {
    public static void main(String[] args) {

        Car car01=new Car(); //obje oluşturudm.
        car01.fiat=150000;
        car01.yıl=2020;
        car01.marka="Toyota";

        System.out.println("Car1 bilgileri Marka :"+ car01.marka +"\n Model: "
                        +car01.model+"\nYil: " + car01.yıl
                        +"\nFiat: " + car01.fiat);

        System.out.println();

        Car car02=new Car();
        System.out.println("Car2 bilgileri Marka :"+ car02.marka +"\n Model: "
                +car02.model+"\nYil: " + car01.yıl
                +"\nFiat: " + car02.fiat);

        /*
        herhangı bir obje üzerinden varıable yazdırmaya calıştıgımızda java
        su sıralama ile arar.
        1.ilk once o ıbje oulşturulduktan sonra bir deger atrandı mı diye bakar.
        2.objenın oluşturuldugu classta varıablea bir deger atandı mı ona bakr.
        3. o zaman data türüne göre java default degeri atar.
         */

    }
}
