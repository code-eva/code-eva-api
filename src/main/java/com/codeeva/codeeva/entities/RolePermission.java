package com.codeeva.codeeva.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class RolePermission {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role")
    private UserRole role;

    @ManyToOne
    @JoinColumn(name = "permission")
    private Permission permission;

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;

        if (this == obj) return true;

        RolePermission rolePermission1 = (RolePermission) obj;
        return id.equals(rolePermission1.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }


}
