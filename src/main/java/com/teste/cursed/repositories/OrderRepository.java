package com.teste.cursed.repositories;

import com.teste.cursed.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//poderia usar o @Repository no começo mas tem o buxim aqui (↓)
public interface OrderRepository extends JpaRepository<Order, Long> {

}
