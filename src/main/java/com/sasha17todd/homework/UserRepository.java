package com.sasha17todd.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {
        if (user == null) {
            throw new InvalidUserDataException("User este null.");
        }
        String username = user.getUsername();
        if (username == null || username.trim().length() < 3) {
            throw new InvalidUserDataException("Username invalid: trebuie sa aiba minim 3 caractere.");
        }
        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Varsta nu poate fi negativa.");
        }
        users.add(user);
    }

    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }
}
