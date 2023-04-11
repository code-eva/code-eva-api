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
public class UserRole {

    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_TEACHER = "ROLE_TEACHER";
    public static final String ROLE_STUDENT = "ROLE_STUDENT";
    private static final UserRole ADMIN = new UserRole("ADMIN", "An user with administrator privileges");
    private static final UserRole TEACHER = new UserRole("TEACHER", "An user who can coordinate students");
    private static final UserRole STUDENT = new UserRole("STUDENT", "An user who can participate for assignment");
    @Id
    private String role;
    private String description;

    public UserRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;

        UserRole userRole1 = (UserRole) obj;
        return role.equals(userRole1.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }


}
