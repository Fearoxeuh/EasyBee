package passecommande;

import javax.swing.*;
import java.awt.*;

public class Accueil extends JFrame {

    public Accueil() {
        // Set the title of the window
        setTitle("Commande");

        // Set layout manager for the main panel
        getContentPane().setLayout(new BorderLayout());

        // Top panel for the "Passer Commande" button
        JPanel topPanel = new JPanel();
        
        JLabel lblNewLabel = new JLabel("Accueil");
        topPanel.add(lblNewLabel);

        // Center panel for the grid of buttons
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4, 5, 10, 10)); // 4 rows, 5 columns, with spacing

//        // Add 20 buttons with "+" symbol to the grid panel
//        for (int i = 0; i < 20; i++) {
//            JButton button = new JButton("+");
//            gridPanel.add(button);
//        }

        // Bottom panel for the "Afficher le panier" button
        JPanel bottomPanel = new JPanel();
        JButton afficherPanierButton = new JButton("Afficher le panier");
        bottomPanel.add(afficherPanierButton);

        // Add panels to the main frame
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(gridPanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Center the window
    }

    public static void main(String[] args) {
        // Create and show the window
        SwingUtilities.invokeLater(() -> {
            Accueil window = new Accueil();
            window.setVisible(true);
        });
    }
}
