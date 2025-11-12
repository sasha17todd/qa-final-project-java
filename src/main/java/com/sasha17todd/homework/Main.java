package com.sasha17todd.homework;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // User valid
        try {
            repo.addUser(new User("testuser", 25));
            System.out.println("Adaugat: testuser");
        } catch (InvalidUserDataException e) {
            System.err.println("Eroare (testuser): " + e.getMessage());
        }

        // AdminUser valid
        try {
            repo.addUser(new AdminUser("admin", 30, "full_access"));
            System.out.println("Adaugat: admin");
        } catch (InvalidUserDataException e) {
            System.err.println("Eroare (admin): " + e.getMessage());
        }

        // Username prea scurt
        try {
            repo.addUser(new User("ab", 22));
            System.out.println("Adaugat: ab");
        } catch (InvalidUserDataException e) {
            System.err.println("Eroare (ab): " + e.getMessage());
        }

        // Varsta negativă
        try {
            repo.addUser(new User("baduser", -5));
            System.out.println("Adaugat: baduser");
        } catch (InvalidUserDataException e) {
            System.err.println("Eroare (baduser): " + e.getMessage());
        }

        // Afișează utilizatorii validați
        System.out.println("\nUtilizatori validi in repository:");
        for (User u : repo.getUsers()) {
            System.out.println(" - " + u);
        }
    }
}
