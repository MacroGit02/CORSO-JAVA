package json;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("persona.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Persona persona = (Persona) objectIn.readObject();
            System.out.println("Deserializzazione completata.");
            System.out.println("Nome: " + persona.getNome());
            System.out.println("Età: " + persona.getEta());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
