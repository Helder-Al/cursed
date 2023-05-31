package com.teste.cursed.config;

import com.teste.cursed.entities.Order;
import com.teste.cursed.entities.User;
import com.teste.cursed.repositories.OrderRepository;
import com.teste.cursed.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test") //importante n erre o nome
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;
    public void run(String... args) throws Exception{

        User u1 = new User(null,"nomedouser1","emailuser1@gmail.com","992465789","123456");
        User u2 = new User(null,"nomedouser2","emailuser2@gmail.com","998765432","124578");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
