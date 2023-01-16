package com.learn.demospringaudit.infrastructures.configs;

import com.learn.demospringaudit.contexts.repositories.ReadBookRepository;
import com.learn.demospringaudit.contexts.repositories.WriteBookRepository;
import com.learn.demospringaudit.infrastructures.repositories.CommandBookRepository;
import com.learn.demospringaudit.infrastructures.repositories.QueryBookRepository;
import com.learn.demospringaudit.infrastructures.services.CommandBookService;
import com.learn.demospringaudit.infrastructures.services.QueryBookService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.learn.demospringaudit.infrastructures.models")
@EnableJpaRepositories("com.learn.demospringaudit.infrastructures.repositories")
public class BookConfig {
    @Bean
    ReadBookRepository readBookRepository(QueryBookRepository queryBookRepository) {
        return new QueryBookService(queryBookRepository);
    }

    @Bean
    WriteBookRepository writeBookRepository(CommandBookRepository commandBookRepository) {
        return new CommandBookService(commandBookRepository);
    }
}
