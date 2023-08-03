package json;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) {
        Persona persona = new Persona("Mario", 30);

        try (FileOutputStream fileOut = new FileOutputStream("persona.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(persona);
            System.out.println("Serializzazione completata.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}