package com.medicore.domain.entities;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.UuidGenerator;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    private UUID id;
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    private String phoneNumber;

}