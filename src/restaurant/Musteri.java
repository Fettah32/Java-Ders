package restaurant;

public class Musteri {
    public static void main(String[] args) {

        Mutfak menu = new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim = new Mutfak("adanakebab" , "mercimek", "kunefe", "ayran");

        System.out.println("siparisim : " + siparisim);
        


    }
}
