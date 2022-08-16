package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        Araba arb1 = new Araba();
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        // access modofier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilir
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep yahic diyor

        // model'i degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim -> ozel yetki tanimlayacaginiz variable'lari private yapin
        //            private bir data ya baska class'lardan ulasmak mumkun olmadigindan
        // 2. adim -> set yetkisi icin setter ve get yetkisi icin getter method'lari olusturalim

        arb1.setModel("Supra"); // model olarak Supra'yi atadik
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok
        arb1.getYakit(); // elektrikli bilgisini yazabildik
        // yakiti degistiremeyiz cunku setter method'u yok
    }
}
