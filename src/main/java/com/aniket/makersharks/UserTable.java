package com.aniket.makersharks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @NonNull
    @NotBlank(message = "Name is mandatory")
    private String username;
    @NonNull
    @NotBlank(message = "email is mandatory")
    private String email;
    @NonNull
    @NotBlank(message = "password is mandatory")
    private String password;
}
