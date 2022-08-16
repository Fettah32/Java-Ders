package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Ogretmen1 : " + ogretmen1);
        System.out.println("");

        Ogretmen ogretmen2 = new Ogretmen("Emre", "SULUKAN", "01/01/2000", "Matematik", "Fizik");
        System.out.println("Ogretmen2 : " + ogretmen2);
        System.out.println("");

        Ogretmen ogretmen3 = new Ogretmen("Cavidan", "EKEN", "01/01/1991");
        System.out.println("Ogretmen3 : " + ogretmen3);
    }
}
