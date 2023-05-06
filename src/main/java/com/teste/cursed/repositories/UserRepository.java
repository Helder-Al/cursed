package com.teste.cursed.repositories;

import com.teste.cursed.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//poderia usar o @Repository no começo mas tem o buxim aqui (↓)
public interface UserRepository extends JpaRepository<User, Long> {

}
