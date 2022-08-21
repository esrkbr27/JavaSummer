package day11strıngManıpulatıon;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelıme = "Java";
        //verilen kelıme cumlede kullanılmamıs
        //verilen kelıme cumlede sadce bır kere kullanılmıs
        //verilen kelıme cumlede bir kere kullanılmıs
        //verilen kelıme cumledebırdenfazla kullanılmıs

        int kelimeIlkIndex = cumle.indexOf(kelıme);
        int kelimeSonIndex = cumle.lastIndexOf(kelıme);
        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelıme cumlede kullanılmamıs");
        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("verilen kelıme cumlede 1 defa kullanılmıs");
        } else {
            System.out.println("verilen kelıme cumlede birden fazla kullanılmıs.");

        }
    }
}