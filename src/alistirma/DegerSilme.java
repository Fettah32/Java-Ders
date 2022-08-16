package alistirma;

import java.util.Scanner;

public class DegerSilme {
    public static void main(String[] args) {
        // Bir string içinden girdiğimiz karakteri
        // silen bir java Method yazın
        // String="kkmekrkkhabkak"" olsun. Silinecek karakter
        // 'k' olsun. geri dönecek değer ==> "merhaba"
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kelimeyi giriniz");
        String str= scan.nextLine();
        System.out.println("lutfen silinecek karakteri girin");
        char harf=scan.next().charAt(0);
        String harf1=harf+"";
        String bos="";
        for (int i = 0; i <str.length() ; i++) {

            if (!str.substring(i,i+1).equals(harf1)){
                bos+=""+str.charAt(i);
            }

        }
        System.out.println(bos);
    }
}

