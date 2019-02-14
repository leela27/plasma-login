package com.stackroute.plasma.plasmalogin.security;

import com.stackroute.plasma.plasmalogin.model.User;

import java.util.Map;

@FunctionalInterface
public interface SecurityTokenGenerator {
    Map<String, String> generateToken(User user);
}



