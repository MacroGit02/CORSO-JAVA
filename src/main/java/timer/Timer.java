package timer;
import java.util.Random;

/**
 * Timer è una classe di utilità per misurareil tempo trascorso tra le chiamate dei due
 * metodi start() ed end(). </br>
 * L'accuratezza è al millisecondo.
 *
 */
public class Timer {

    private Long startTime;
    private Long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }
    /**
     *
     * Ritorna il tempo trascorso tra lo start() e l'end()
     */

    public Long getElapsedTime() {
        return (endTime - startTime);
    }

    public static void main(String[] args) {
        String s = "start";
        final int limit = 1000000;
        Timer tt = new Timer();
        tt.start();
        int n = 42;
        for (Integer i = 0; i<limit; i++) {
            Random rnd = new Random ( n % 1000);
            int x = rnd.nextInt(1000);
            s = String.valueOf(x);
            n = Integer.valueOf(s);
        }
    }

}


