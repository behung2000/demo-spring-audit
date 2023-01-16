package com.learn.demospringaudit.distributed.configs;

import com.learn.demospringaudit.audit.configs.AuditConfig;
import com.learn.demospringaudit.contexts.repositories.ReadBookRepository;
import com.learn.demospringaudit.contexts.repositories.WriteBookRepository;
import com.learn.demospringaudit.contexts.services.ReadBookService;
import com.learn.demospringaudit.contexts.services.WriteBookService;
import com.learn.demospringaudit.infrastructures.configs.BookConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    AuditConfig.class,
    BookConfig.class
})
public class Config {
    @Bean
    ReadBookService readBookService(ReadBookRepository read) {
        return new ReadBookService(read);
    }

    @Bean
    WriteBookService writeBookService(WriteBookRepository write) {
        return new WriteBookService(write);
    }
}
