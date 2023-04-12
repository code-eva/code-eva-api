package com.codeeva.codeeva.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Permission {

    private static final Permission READ = new Permission("READ", "read all the user data");
    private static final Permission WRITE = new Permission("WRITE", "write all the user data");
    private static final Permission CHANGE = new Permission("CHANGE", "change all the user data");


    @Id
    private String permission;
    private String description;


    public Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) return false;
        if (this == obj) return true;
        Permission permission1 = (Permission) obj;
        return permission.equals(permission1.permission);

    }

    @Override
    public int hashCode() {
        return Objects.hash(permission);
    }

}
