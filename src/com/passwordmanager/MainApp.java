package com.passwordmanager;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
public class MainApp {
    public static void main(String[] args) {
        // Test de la connexion à la base de données
        DatabaseManager dbManager = new DatabaseManager();
        try {
            dbManager.getConnection();
            System.out.println("Connexion à la base de données réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Lancement de l'interface graphique
        SwingUtilities.invokeLater(() -> {
            PasswordManagerGUI gui = new PasswordManagerGUI();
            gui.setVisible(true);
        });
    }
}