package persona;
import java.util.Scanner;

public class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int eta;
    private double altezza;
    private boolean stato;

    public Persona(String nome, String cognome, String codiceFiscale, int eta, double altezza, boolean stato) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.eta = eta;
        this.altezza = altezza;
        this.stato = stato;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public int getEta() {
        return eta;
    }

    public double getAltezza() {
        return altezza;
    }

    public boolean isStato() {
        return stato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setEta(int eta) {
        // Verifica che l'età non sia inferiore a 0
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("Errore: l'età non può essere inferiore a 0.");
        }
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci il cognome: ");
        String cognome = input.nextLine();

        System.out.print("Inserisci il codice fiscale: ");
        String codiceFiscale = input.nextLine();

        System.out.print("Inserisci l'età: ");
        int eta = input.nextInt();

        System.out.print("Inserisci l'altezza: ");
        double altezza = input.nextDouble();

        System.out.print("Inserisci lo stato: ");
        boolean stato = input.nextBoolean();

        input.close();

        Persona persona = new Persona(nome, cognome, codiceFiscale, eta, altezza, stato);
        System.out.println("Nome: " + persona.getNome());
        System.out.println("Cognome: " + persona.getCognome());
        System.out.println("Codice Fiscale: " + persona.getCodiceFiscale());
        System.out.println("Età: " + persona.getEta());
        System.out.println("Altezza: " + persona.getAltezza());
        System.out.println("Stato: " + persona.isStato());

        persona.setEta(-5);
        persona.setStato(false);
    }
}