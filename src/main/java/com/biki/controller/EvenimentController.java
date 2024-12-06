package com.biki.controller;

import com.biki.model.Eveniment;
import com.biki.service.EvenimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/evenimente")
public class EvenimentController {

    @Autowired
    private EvenimentService evenimentService;

    // Obține toate evenimentele
    @GetMapping
    public List<Eveniment> getAllEvenimente() {
        return evenimentService.getAllEvenimente();
    }

    // Obține un eveniment după ID
    @GetMapping("/{id}")
    public ResponseEntity<Eveniment> getEvenimentById(@PathVariable Long id) {
        Optional<Eveniment> eveniment = evenimentService.getEvenimentById(id);
        return eveniment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Adaugă un eveniment
    @PostMapping
    public ResponseEntity<Eveniment> addEveniment(@RequestBody Eveniment eveniment) {
        Eveniment savedEveniment = evenimentService.addEveniment(eveniment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEveniment);
    }

    // Actualizează un eveniment
    @PutMapping("/{id}")
    public ResponseEntity<Eveniment> updateEveniment(@PathVariable Long id, @RequestBody Eveniment eveniment) {
        Eveniment updatedEveniment = evenimentService.updateEveniment(id, eveniment);
        return updatedEveniment != null ? ResponseEntity.ok(updatedEveniment) : ResponseEntity.notFound().build();
    }

    // Șterge un eveniment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEveniment(@PathVariable Long id) {
        evenimentService.deleteEveniment(id);
        return ResponseEntity.noContent().build();
    }
}
