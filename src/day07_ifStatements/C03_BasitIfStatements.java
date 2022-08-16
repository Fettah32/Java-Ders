package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Bir if statements'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        Eger birden fazla satir ayni if sartina baglandiysa mutlaka {} kullanmaliyiz
         */
        int sayi = -23;// -23 te hicbir seyin calismamasi gerekir ama ikinci ucuncu satirlar
        //parantez olmadigi icin bagimsiz calisir

        if (sayi > 0)
            System.out.println("sayi pozitif");// degere bagli
        System.out.println("pozitif kalacaktir");// her zaman calisir
        System.out.println("ucuncu satir");// her zaman calisir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");// degere bagli
        System.out.println("cift kalacaktir");// her zaman calisir

        if (sayi % 5 == 0)
            System.out.println("sayi 5'in tam kati");//degere bagli

    }
}
