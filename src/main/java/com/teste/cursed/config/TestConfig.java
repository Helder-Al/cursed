package com.teste.cursed.config;

import com.teste.cursed.entities.User;
import com.teste.cursed.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") //importante n erre o nome
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public void run(String... args) throws Exception{

        User u1 = new User(null,"nomedouser1","emailuser1@gmail.com","992465789","123456");
        User u2 = new User(null,"nomedouser2","emailuser2@gmail.com","998765432","124578");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
