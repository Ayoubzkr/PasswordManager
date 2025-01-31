package com.passwordmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordManagerGUI extends JFrame {
    private JTextField accountNameField, usernameField, emailField, phoneField, urlField, passwordField;
    private JTextArea notesArea;
    private JButton addButton, viewButton;

    public PasswordManagerGUI() {
        setTitle("Gestionnaire de Mots de Passe");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(9, 2));
        panel.add(new JLabel("Nom du compte :"));
        accountNameField = new JTextField();
        panel.add(accountNameField);

        panel.add(new JLabel("Nom d'utilisateur :"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Email :"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Téléphone :"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("URL :"));
        urlField = new JTextField();
        panel.add(urlField);

        panel.add(new JLabel("Mot de passe :"));
        passwordField = new JTextField();
        panel.add(passwordField);

        panel.add(new JLabel("Notes :"));
        notesArea = new JTextArea();
        panel.add(new JScrollPane(notesArea));

        addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PasswordEntry entry = new PasswordEntry(
                    accountNameField.getText(),
                    usernameField.getText(),
                    emailField.getText(),
                    phoneField.getText(),
                    urlField.getText(),
                    passwordField.getText(),
                    notesArea.getText()
                );
                DatabaseManager dbManager = new DatabaseManager();
                dbManager.addPasswordEntry(entry);
                JOptionPane.showMessageDialog(null, "Mot de passe ajouté avec succès !");
            }
        });
        panel.add(addButton);

        viewButton = new JButton("Voir les entrées");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseManager dbManager = new DatabaseManager();
                dbManager.getAllPasswordEntries();
            }
        });
        panel.add(viewButton);

        add(panel);
        setVisible(true);
    }
}