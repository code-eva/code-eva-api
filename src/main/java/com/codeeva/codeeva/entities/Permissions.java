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
public class Permissions {

    private static final Permissions READ = new Permissions("READ", "read all the user data");
    private static final Permissions WRITE = new Permissions("WRITE", "write all the user data");
    private static final Permissions CHANGE = new Permissions("CHANGE", "change all the user data");


    @Id
    @Column(nullable = false)
    private String permission;
    private String description;


    public Permissions(String permission) {
        this.permission =permission;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || (getClass() != obj.getClass())) return  false;
        if (this == obj ) return  true;
        Permissions permissions1 = (Permissions) obj;
        return permission.equals(permissions1.permission);

    }

    @Override
    public int hashCode() {
        return Objects.hash(permission);
    }
}
