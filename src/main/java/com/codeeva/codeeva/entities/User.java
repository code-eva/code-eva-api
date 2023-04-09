package com.codeeva.codeeva.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "user_account")
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @NotEmpty(message = "username is required")
    @Size(min = 2, max = 32, message = "username must be between 2 and 32 characters long")
    @Column(unique = true, nullable = false)
    private String username;

    @NotEmpty(message = "Password is required")
    @Size(min = 2, max = 32, message = "Password must be between 8 and 32 characters long")
    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    @OneToOne
    @JoinColumn(name = "email")
    private Email email;

    @NotEmpty(message = "firstname is required")
    @Size(min = 2, max = 32, message = "firstname must be between 2 and 32 characters long")
    @Column(nullable = false)
    private String firstName;

    @NotEmpty(message = "lastname is required")
    @Size(min = 2, max = 32, message = "lastname must be between 2 and 32 characters long")
    @Column(nullable = false)
    private String lastName;

    @NotEmpty(message = "phone number is required")
    @Size(min = 2, max = 32, message = "phone number must be between 2 and 32 characters long")
    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "role")
    private UserRole userrole;

    @Column(nullable = false)
    private Boolean isEnabled = true;

    @Override
    public boolean equals(Object obj){
        if(obj == null || Hibernate.getClass(this) != Hibernate.getClass(obj)) return false;
        if(this == obj) return true;
        User user = (User) obj;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
