package com.thesol.newoffer.repositories;

import com.thesol.newoffer.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminsRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
