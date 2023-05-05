package com.teste.cursed.repositories;

import com.teste.cursed.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
