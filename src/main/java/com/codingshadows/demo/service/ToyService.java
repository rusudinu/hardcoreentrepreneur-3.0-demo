package com.codingshadows.demo.service;

import com.codingshadows.demo.model.Toy;
import com.codingshadows.demo.repository.ToyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToyService {
    private final ToyRepository toyRepository;

    public Toy getToy(Long id) {
        return toyRepository.findById(id).orElseThrow();
    }

    public Toy createToy(Toy toy) {
        return toyRepository.save(toy);
    }

    public Toy updateToy(Toy toy) {
        return toyRepository.save(toy);
    }

    public void deleteToy(Long id) {
        toyRepository.deleteById(id);
    }

    public List<Toy> getAllToys() {
        return toyRepository.findAll();
    }
}
