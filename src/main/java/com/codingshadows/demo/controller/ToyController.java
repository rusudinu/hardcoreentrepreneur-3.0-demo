package com.codingshadows.demo.controller;

import com.codingshadows.demo.model.Toy;
import com.codingshadows.demo.service.ToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/toy")
@RequiredArgsConstructor
public class ToyController {
    private final ToyService toyService;

    @GetMapping("{id}")
    public Toy getToy(@PathVariable Long id) {
        return toyService.getToy(id);
    }

    @GetMapping
    public List<Toy> getAllToys() {
        return toyService.getAllToys();
    }

    @PostMapping
    public Toy createToy(@RequestBody Toy toy) {
        return toyService.createToy(toy);
    }

    @PutMapping
    public Toy updateToy(@RequestBody Toy toy) {
        return toyService.updateToy(toy);
    }

    @DeleteMapping("{id}")
    public void deleteToy(@PathVariable Long id) {
        toyService.deleteToy(id);
    }
}
