package com.SSO.SSO.Implementation.Services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    User authenticate(String username, String password);
    UserDetails loadUserByUsername(String username);
}
