package ru.zakharov.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
