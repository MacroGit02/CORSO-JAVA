package morracinese;
import java.util.Scanner;
public class MorraCinese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella Morra Cinese!");
        System.out.println("1 - Sasso");
        System.out.println("2 - Carta");
        System.out.println("3 - Forbice");
        System.out.println("0 - Esci");

        boolean continua = true;
        while (continua) {
            System.out.print("Scelta del giocatore 1: ");
            int giocatore1 = scanner.nextInt();

            if (giocatore1 == 0) {
                break;
            }

            System.out.print("Scelta del giocatore 2: ");
            int giocatore2 = scanner.nextInt();

            if (giocatore2 == 0) {
                break;
            }

            System.out.println("Risultato: " + competi(giocatore1, giocatore2));
            System.out.println();
        }
    }

    private static String competi(int giocatore1, int giocatore2) {
        String vincitore;

        if (giocatore1 == giocatore2) {
            vincitore = "Pareggio!";
        } else if ((giocatore1 == 1 && giocatore2 == 3) || (giocatore1 == 2 && giocatore2 == 1) || (giocatore1 == 3 && giocatore2 == 2)) {
            vincitore = "Giocatore 1 vince!";
        } else {
            vincitore = "Giocatore 2 vince!";
        }

        return vincitore;
    }
}