package com.passwordmanager;

public class PasswordEntry {
    private int id;
    private String accountName;
    private String username;
    private String email;
    private String phone;
    private String url;
    private String password;
    private String notes;

    // Constructeur par défaut
    public PasswordEntry() {
    }

    // Constructeur avec paramètres
    public PasswordEntry(String accountName, String username, String email, String phone, String url, String password, String notes) {
        this.accountName = accountName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.url = url;
        this.password = password;
        this.notes = notes;
    }

    // Getters et setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}