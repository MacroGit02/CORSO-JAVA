package tombola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Tombola {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        Random random = new Random();
        int tentativi = 20;

        for (int i = 1; i <= 90; i++) {
            numeri.add(i);
        }

        Collections.shuffle(numeri);

        System.out.println("Estrazioni:");

        for (int i = 0; i < tentativi; i++) {
            int estratto = numeri.get(i);
            numeri.remove(i);
            System.out.println("Numero uscito: " + estratto);
        }
    }
}