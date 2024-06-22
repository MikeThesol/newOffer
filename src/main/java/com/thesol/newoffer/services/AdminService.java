package com.thesol.newoffer.services;

import com.thesol.newoffer.models.Admin;
import com.thesol.newoffer.repositories.AdminsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminService {
    private final AdminsRepository adminsRepository;
    private final PasswordEncoder passwordEncoder;

    public Admin createAdmin(String username, String password) {
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(passwordEncoder.encode(password));
        return adminsRepository.save(admin);
    }

    public boolean createAdmin(Admin admin) {
        if(adminsRepository.findByUsername(admin.getUsername()) != null) return false;
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        log.info("Admin created: " + admin.getUsername());
        adminsRepository.save(admin);
        return true;
    }
}
