package com.codeeva.codeeva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity


public class Email {

    @Id
    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private boolean verified = false;



}
