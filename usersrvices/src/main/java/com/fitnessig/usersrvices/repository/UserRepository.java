package com.fitnessig.usersrvices.repository;

import com.fitnessig.usersrvices.model.user;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, String> {


    boolean existsByEmail( String email);

    user findByEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email);

    Boolean existsByKeycloakId(String userId);
}
