package com.learn.demospringaudit.audit.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class CustomAuditAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        //return Optional.of("Bill");

        String name = SecurityContextHolder.getContext().getAuthentication().getName();

        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("use name can't take");
        }

        return Optional.of(name);
    }
}