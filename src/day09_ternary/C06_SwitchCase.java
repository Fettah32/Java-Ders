package day09_ternary;


public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input = "Cumartesi";

        input = input.toLowerCase();


        switch (input) {
            case "pazartesi":
                System.out.println("Hafata ici");
                break;
            case "sali":
                System.out.println("Hafata ici");
                break;
            case "carsamba":
                System.out.println("Hafata ici");
                break;
            case "persembe":
                System.out.println("Hafata ici");
                break;
            case "cuma":
                System.out.println("Hafata ici");
                break;
            case "cumartesi":
                System.out.println("Hafata sonu");
                break;
            case "pazar":
                System.out.println("Hafata sonu");
                break;
            default:
                System.out.println("Gecerli bir gun adi giriniz");
        }


        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafata ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafata sonu");
                break;
            default:
                System.out.println("Gecerli bir gun adi giriniz");
        }
    }
}
