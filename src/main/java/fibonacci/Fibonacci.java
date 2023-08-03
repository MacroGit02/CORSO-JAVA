package fibonacci;

public class Fibonacci {
    public long getRicorsiva(Long n) {
        if (n==0)
            return 1L;
        if (n.equals(1L))
            return 1L;
        return getRicorsiva (n-1) + getRicorsiva (n-2);
    }

    public static void main(String[]args) {
        Fibonacci f = new Fibonacci();
        final long LIMIT = 7L;
        for (long i = 0; i < LIMIT; i++) {
            Long fibonacci = f.getRicorsiva(i);
            System.out.println("Fibonacci " + i + " ->"+ fibonacci);
        }
    }
}
