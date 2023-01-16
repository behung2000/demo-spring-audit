package com.learn.demospringaudit.audit.configs;

import com.learn.demospringaudit.audit.services.CustomAuditAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditConfig {
    @Bean
    AuditorAware<String> stringAuditorAware() {
        return new CustomAuditAware();
    }
}
