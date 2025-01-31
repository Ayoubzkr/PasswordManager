package com.passwordmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/PasswordManagerDB";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Mot de passe MySQL (vide par défaut dans XAMPP)

    // Méthode pour établir une connexion à la base de données
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Méthode pour ajouter une entrée de mot de passe
    public void addPasswordEntry(PasswordEntry entry) {
        String query = "INSERT INTO passwords (account_name, username, email, phone, url, password, notes) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, entry.getAccountName());
            stmt.setString(2, entry.getUsername());
            stmt.setString(3, entry.getEmail());
            stmt.setString(4, entry.getPhone());
            stmt.setString(5, entry.getUrl());
            stmt.setString(6, entry.getPassword());
            stmt.setString(7, entry.getNotes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour récupérer toutes les entrées de la base de données
    public void getAllPasswordEntries() {
        String query = "SELECT * FROM passwords";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Account: " + rs.getString("account_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

    // Méthode pour mettre à jour une entrée de mot de passe
   