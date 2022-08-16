package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();
        System.out.println("Kamyon1 ozellikleri : " + kamyon1.toString());

        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("kamyon2 = " + kamyon2);

        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2015, 250000);
        System.out.println("kamyon3 = " + kamyon3);

        Kamyon kamyon4 = new Kamyon("Scania", "s540");
        System.out.println("kamyon4 = " + kamyon4);
    }
}
