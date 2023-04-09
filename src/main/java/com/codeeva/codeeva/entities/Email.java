package com.codeeva.codeeva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity


public class Email {

    @Id
    @javax.validation.constraints.Email
    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private boolean verified = false;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Email email1 = (Email) obj;
        return email.equals(email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }


}
