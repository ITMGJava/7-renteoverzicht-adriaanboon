import java.util.Locale;
import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);

        System.out.println("Wat is uw naam?");
        String naam = keyboard.nextLine();

        System.out.println("Hoeveel wilt u sparen?");
        int invoerGetal = keyboard.nextInt();
        double samenGesteldeRente = invoerGetal;

        int rente = 0;
        if (invoerGetal < 300) {
            rente = 3;
        } else if (invoerGetal < 600) {
            rente = 2;
        } else if (invoerGetal < 1000) {
            rente = 1;
        }
        System.out.println("Uw rente over dit bedrag is: " + rente + "%");
        double interest = rente * 0.01;

        System.out.println("Hoi "+naam+"! Over hoeveel jaren wilt u sparen?");

        int aantaljaren = keyboard.nextInt();
        int teller;
        System.out.println("Goed nieuws "+naam+ "! Uw samengestelde rente over deze "+aantaljaren+" jaren is:");
        for (teller = 1; teller <= aantaljaren; teller++) {
            samenGesteldeRente = samenGesteldeRente * (1 + interest);
            double roundoff = Math.round(samenGesteldeRente * 100.0) / 100.0;

            System.out.print("Jaar " + teller + ": ");
            System.out.println(roundoff);
        }
    }
}
