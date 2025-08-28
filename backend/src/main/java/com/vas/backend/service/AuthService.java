package com.vas.backend.service;

import com.vas.backend.model.User;
import com.vas.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository repo;

    public AuthService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User u) {
        return repo.save(u);
    }

    public Optional<User> login(String email, String password) {
        return repo.findByEmail(email)
                   .filter(user -> user.getPassword().equals(password));
    }
}