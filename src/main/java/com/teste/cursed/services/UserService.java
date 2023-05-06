package com.teste.cursed.services;

import com.teste.cursed.entities.User;
import com.teste.cursed.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//pode usar @Component, @repository ou @Service
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
