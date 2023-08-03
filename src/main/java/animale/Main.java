package animale;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Animale[] animali = {
                new Animale("Cane", "Descrizione del cane"),
                new Animale("Gatto", "Descrizione del gatto"),
                // Aggiungi altri animali con le rispettive descrizioni
        };

        // Crea una finestra JFrame
        JFrame frame = new JFrame("Seleziona animale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un pannello di selezione
        final JPanel selectionPanel = new JPanel();
        selectionPanel.setLayout(new GridLayout(0, 1));

        // Aggiungi pulsanti per ogni animale
        for (final Animale animale : animali) {
            JButton button = new JButton(animale.getNome());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Mostra una finestra di dialogo con la descrizione dell'animale selezionato
                    JOptionPane.showMessageDialog(selectionPanel, animale.getDescrizione(),
                            animale.getNome(), JOptionPane.INFORMATION_MESSAGE);
                }
            });
            selectionPanel.add(button);
        }

        // Aggiungi il pannello di selezione alla finestra
        frame.add(selectionPanel);

        // Imposta dimensioni, posizione e visibilità della finestra
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}