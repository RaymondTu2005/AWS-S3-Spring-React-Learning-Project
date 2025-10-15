package com.RaymondAWSS3ReactSpring.auth;

import com.RaymondAWSS3ReactSpring.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
