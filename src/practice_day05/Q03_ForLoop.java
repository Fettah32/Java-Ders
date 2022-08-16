package practice_day05;

import java.util.Scanner;

public class Q03_ForLoop {
    public static void main(String[] args) {
         /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Satir sayisi giriniz :");
        int satirSayisi = scan.nextInt();
        System.out.print("Sutun sayisi giriniz :");
        int sutunSayisi = scan.nextInt();
        for (int i = 1; i <= satirSayisi; i++) {
            for (int k = 1; k <= sutunSayisi; k++) {
                System.out.print("* ");
            }
            System.out.println(); //bu bosluk olmazsa hepsini yan yana yazar
        }
    }
}
