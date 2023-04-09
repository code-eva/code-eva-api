package com.codeeva.codeeva.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity

public class RolePermissions {

    @Id
    @ManyToOne
    @JoinColumn(name = "role")
    private UserRole role;

    @ManyToOne
    @JoinColumn(name = "permission")
    private Permissions permission;
}
