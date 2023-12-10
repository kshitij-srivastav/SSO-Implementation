package com.SSO.SSO.Implementation.ServiceImplementation;

import com.SSO.SSO.Implementation.Services.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    // Simulated user data (replace this with a database or external authentication system)
    private static final Map<String, String> users = new HashMap<>();

    static {
        // In a real-world scenario, passwords should be hashed
        users.put("john", "password123");
        users.put("jane", "password456");
    }

    @Override
    public User authenticate(String username, String password) {
        String storedPassword = users.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            // User authenticated successfully
            return new User(username,password, java.util.List.of());
        }
        return null; // Authentication failed
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String storedPassword = users.get(username);
        if (storedPassword != null) {
            // In a real-world scenario, you might fetch user details from a database
            return User.builder()
                    .username(username)
                    .password(storedPassword)
                    .roles("USER") // Provide user roles if needed
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}

