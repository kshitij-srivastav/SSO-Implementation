package com.SSO.SSO.Implementation.Services;

import com.SSO.SSO.Implementation.Models.User;

public interface JwtTokenService {
    String generateToken(User user);
    String getSecretKey();
}

