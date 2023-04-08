package com.codeeva.codeeva.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;




@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class UserRole {

    private static final UserRole ADMIN = new UserRole("ADMIN", "An user with administrator privileges", "All");
    private static final UserRole TEACHER = new UserRole("TEACHER", "An user who can coordinate students", "All");
    private static final UserRole STUDENT = new UserRole("STUDENT", "An user who can participate for assignment", "No");

    @Id
    private String role;
    private String description;
    private String permission;

    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_TEACHER = "ROLE_TEACHER";
    public static final String ROLE_STUDENT = "ROLE_STUDENT";


}
