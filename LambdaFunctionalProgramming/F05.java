package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F05 {

    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println("ortalamadaPuanlarVerilenSayidanBuyukMu = " +
                ortalamadaPuanlarVerilenSayidanBuyukMu(coursesList, 75));

        System.out.println("kursadiverilenkelimeyiiçeriyorMu(coursesList,\"ESRA\") = " +
                kursadiverilenkelimeyiiçeriyorMu(coursesList, "ESRA"));

        ortalamasiEnYuksekKurs(coursesList);
        ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,2);
    }

    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.

    public static boolean ortalamadaPuanlarVerilenSayidanBuyukMu(List<Courses> list,int x){

        //courses data tipinde eleman aldıgım için bu listten bana objeler gelecek.(içinde objeler olan bir list)
        //Class isimleri aynı zamanda data type dır

        return list.stream().allMatch(t-> t.getAverageScore()>x);
    }

    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun

    public static boolean kursadiverilenkelimeyiiçeriyorMu(List<Courses>list, String kelime){

        return list.stream().anyMatch(t-> t.getCourseName().contains(kelime));
    }

    //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun

    public static void ortalamasiEnYuksekKurs(List<Courses>list){

       String sonuc= list.stream().sorted(Comparator.comparing(Courses::getAverageScore).
                reversed()).findFirst().get().getCourseName();

    }

    //4) List öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın

   public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list,int x) {

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

   }
}
