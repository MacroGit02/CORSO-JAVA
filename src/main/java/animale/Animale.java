package animale;
public class Animale {
    private String nome;
    private String descrizione;

    public Animale(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
}