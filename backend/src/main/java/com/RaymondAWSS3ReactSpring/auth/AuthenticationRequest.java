package com.RaymondAWSS3ReactSpring.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
