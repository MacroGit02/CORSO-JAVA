package tombolaeliminatoria;


import java.util.Random;

public class TombolaEliminatoria {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeri = new int[90];
        int tentativi = 20;

        // Initialize the array with numbers from 1 to 90
        for (int i = 0; i < 90; i++) {
            numeri[i] = i + 1;
        }

        System.out.println("Estrazioni:");

        for (int i = 0; i < tentativi; i++) {
            int index = random.nextInt(90 - i);
            int estratto = numeri[index];
            numeri[index] = numeri[90 - i - 1];
            System.out.println("Numero uscito: " + estratto);
        }
    }
}
