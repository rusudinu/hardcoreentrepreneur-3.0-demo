package com.codingshadows.demo.repository;

import com.codingshadows.demo.model.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Long> {
}
