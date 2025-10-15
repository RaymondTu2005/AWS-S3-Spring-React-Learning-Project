package com.RaymondAWSS3ReactSpring.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
