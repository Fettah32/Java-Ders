package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //  verilen stringdeki kullanilan harfleri tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yapiniz

        String input = "Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput = "";

        String islenecekKelime = input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0, 1)); //J
        benzersizInput+=islenecekKelime.substring(0,1); //J

        for (int i = 0; i < islenecekKelime.length(); i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersizInput : " + benzersizInput);
        System.out.println("Kelimede islenen benzersiz harf sayisi : " + benzersizInput.length());

    }
}
