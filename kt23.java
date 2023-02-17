import java.util.Random;
import java.util.Scanner;

public class TaringuMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int kasutajaVõidud = 0;
        int arvutiVõidud = 0;

        System.out.println("Tere tulemast täringu mängu!");

        while (true) {
            System.out.print("Kas soovite veeretada täringut? (jah/ei): ");
            String input = scanner.nextLine();

            if (input.equals("ei")) {
                break;
            }

            int kasutajaTaring = random.nextInt(6) + 1;
            int arvutiTaring = random.nextInt(6) + 1;

            System.out.println("Sina veeretasid " + kasutajaTaring + " silma, arvuti veeretas " + arvutiTaring + " silma");

            if (kasutajaTaring > arvutiTaring) {
                System.out.println("Sina võitsid!");
                kasutajaVõidud++;
            } else if (kasutajaTaring < arvutiTaring) {
                System.out.println("Arvuti võitis.");
                arvutiVõidud++;
            } else {
                System.out.println("Viik.");
            }

            System.out.println("Hetke seis: sina - " + kasutajaVõidud + ", arvuti - " + arvutiVõidud);
        }

        System.out.println("Mäng lõppes. Sina võitsid " + kasutajaVõidud + " korda ja arvuti võitis " + arvutiVõidud + " korda.");

        if (kasutajaVõidud > arvutiVõidud) {
            System.out.println("Sina võitsid!");
        } else if (kasutajaVõidud < arvutiVõidud) {
            System.out.println("Arvuti võitis.");
        } else {
            System.out.println("Mäng lõppes viigiga.");
        }
    }
}
