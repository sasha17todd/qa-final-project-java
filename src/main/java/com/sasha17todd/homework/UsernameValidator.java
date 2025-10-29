package com.sasha17todd.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                continue;
            }

            boolean areSpatiu = false;
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i) == ' ') {
                    areSpatiu = true;
                    break;
                }
            }
            if (areSpatiu) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                continue;
            }

            boolean areCifra = false;
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c >= '0' && c <= '9') {
                    areCifra = true;
                    break;
                }
            }
            if (!areCifra) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                continue;
            }

            System.out.println("Username acceptat: " + username);
            break;

        } while (true);

        scanner.close();
    }
}
