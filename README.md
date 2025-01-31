# Gestionnaire de Mots de Passe

## Aperçu du Projet

L'objectif de ce projet est de créer une application simple de gestion de mots de passe en Java qui permet aux utilisateurs de stocker, gérer et générer des mots de passe sécurisés pour leurs comptes en ligne. L'application dispose d'une interface utilisateur graphique (GUI) développée avec Swing, ainsi que d'une base de données MySQL pour le stockage des mots de passe. 

L'application inclut également une fonctionnalité de mot de passe principal qui chiffre et déchiffre la base de données à l'aide de l'algorithme AES. Cette fonctionnalité renforce la sécurité en ligne des utilisateurs en générant des mots de passe forts et aléatoires.

## Objectifs du Projet

- Fournir un moyen pratique et sûr de stocker et accéder aux mots de passe.
- Renforcer la sécurité en ligne des utilisateurs.
- Améliorer la productivité des utilisateurs en réduisant le temps et les efforts nécessaires à la mémorisation et à la saisie des mots de passe.
- Démontrer l'utilisation du langage de programmation Java et diverses bibliothèques pour le développement d'une application de bureau.

## Fonctionnalités

- Création d'un mot de passe principal pour protéger la base de données.
- Ajout, modification, suppression et recherche de mots de passe.
- Génération de mots de passe aléatoires selon des critères définis par l'utilisateur.
- Copie des mots de passe dans le presse-papiers ou affichage sous forme de codes QR (facultatif).
- Exportation et importation de mots de passe sous forme de fichiers CSV.
- Chiffrement et déchiffrement de la base de passe à l'aide de l'algorithme AES.

## Installation

### Pré-requis

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [XAMPP](https://www.apachefriends.org/index.html) (pour faciliter l'installation de MySQL et PHPMyAdmin)

### Étapes d'Installation

1. **Cloner le dépôt GitHub**:
    ```bash
    git clone https://github.com/votre-nom-utilisateur/gestionnaire-mots-de-passe.git
    cd gestionnaire-mots-de-passe
    ```

2. **Configurer la Base de Données**:
    - Créez une nouvelle base de données nommée `PasswordManagerDB` dans MySQL.
    - Exécutez le script SQL suivant pour créer la table `passwords`:

        ```sql
        CREATE DATABASE PasswordManagerDB;

        USE PasswordManagerDB;

        CREATE TABLE passwords (
            id INT AUTO_INCREMENT PRIMARY KEY,
            account_name VARCHAR(255) NOT NULL,
            username VARCHAR(255),
            email VARCHAR(255),
            phone VARCHAR(20),
            website_url VARCHAR(255),
            password TEXT NOT NULL,
            notes TEXT
        );
        ```

3. **Configurer les Paramètres de Connexion**:
    - Dans le fichier `Main.java`, modifiez les paramètres de connexion à la base de données si nécessaire:

        ```java
        private static final String URL = "jdbc:mysql://localhost:3306/PasswordManagerDB";
        private static final String USER = "root"; // Votre nom d'utilisateur MySQL
        private static final String PASSWORD = ""; // Votre mot de passe MySQL
        ```

4. **Ajouter la Bibliothèque MySQL Connector/J**:
    - Téléchargez le fichier JAR `mysql-connector-java-x.x.x.jar` depuis [ici](https://dev.mysql.com/downloads/connector/j/).
    - Placez le fichier JAR dans le dossier `lib` de votre projet et ajoutez-le au chemin de construction dans Eclipse.

5. **Exécuter l'Application**:
    - Ouvrez le projet dans Eclipse IDE.
    - Compilez et exécutez le fichier `Main.java`.

## Utilisation

- Une fois l'application lancée, vous pouvez commencer à ajouter, modifier, supprimer et rechercher vos mots de passe.
- Pour activer le chiffrement/déchiffrement, configurez un mot de passe principal dans les paramètres de l'application.

## Documentation

- Un manuel d'utilisation complet avec des instructions d'installation et des captures d'écran sera disponible bientôt.
- Une documentation technique avec des diagrammes de conception (UML, cas d'utilisation) sera également fournie.

## Contributions

Les contributions sont bienvenues ! Pour contribuer, veuillez suivre ces étapes :

1. Fork le projet.
2. Créez une branche (`git checkout -b feature/nouvelle-fonctionnalité`).
3. Committez vos modifications (`git commit -am 'Ajout de la nouvelle fonctionnalité'`).
4. Push vers la branche (`git push origin feature/nouvelle-fonctionnalité`).
5. Ouvrez une Pull Request.

## Licence

Ce projet est sous licence MIT. Consultez le fichier LICENSE pour plus de détails.

---

Nous espérons que cette application répondra à vos besoins en matière de gestion de mots de passe. Si vous avez des questions ou des suggestions, n'hésitez pas à nous contacter !

[![GitHub issues](https://img.shields.io/github/issues/votre-nom-utilisateur/gestionnaire-mots-de-passe)](https://github.com/votre-nom-utilisateur/gestionnaire-mots-de-passe/issues)
[![GitHub forks](https://img.shields.io/github/forks/votre-nom-utilisateur/gestionnaire-mots-de-passe)](https://github.com/votre-nom-utilisateur/gestionnaire-mots-de-passe/network)
[![GitHub stars](https://img.shields.io/github/stars/votre-nom-utilisateur/gestionnaire-mots-de-passe)](https://github.com/votre-nom-utilisateur/gestionnaire-mots-de-passe/stargazers)
