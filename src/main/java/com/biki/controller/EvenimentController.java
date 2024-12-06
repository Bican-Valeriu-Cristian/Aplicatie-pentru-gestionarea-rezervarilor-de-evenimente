package com.biki.controller;

import com.biki.model.Eveniment;
import com.biki.service.EvenimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evenimente")
public class EvenimentController {

    @Autowired
    private EvenimentService evenimentService;

    // Endpoint GET pentru a obține toate evenimentele
    @GetMapping
    public List<Eveniment> getAllEvenimente() {
        return evenimentService.getAllEvenimente();
    }

    // Endpoint POST pentru a crea un eveniment
    @PostMapping
    public Eveniment createEveniment(@RequestBody Eveniment eveniment) {
        return evenimentService.createEveniment(eveniment);
    }

    // Endpoint DELETE pentru a șterge un eveniment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEveniment(@PathVariable Long id) {
        evenimentService.deleteEveniment(id);
        return ResponseEntity.noContent().build();
    }
}
