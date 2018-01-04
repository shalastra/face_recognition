package io.shalastra.backend.startup;

import io.shalastra.backend.models.User;
import io.shalastra.backend.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    UserRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        repository.save(new User());

        log.info(repository.findOne(1L).toString());
    }
}