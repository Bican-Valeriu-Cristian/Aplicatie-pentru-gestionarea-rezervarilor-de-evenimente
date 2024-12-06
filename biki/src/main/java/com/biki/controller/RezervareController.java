package com.biki.controller;

import com.biki.model.Rezervare;
import com.biki.service.RezervareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rezervari")
public class RezervareController {

    @Autowired
    private RezervareService rezervareService;

    // Obține toate rezervările
    @GetMapping
    public List<Rezervare> getAllRezervari() {
        return rezervareService.getAllRezervari();
    }

    // Obține o rezervare după ID
    @GetMapping("/{id}")
    public ResponseEntity<Rezervare> getRezervareById(@PathVariable Long id) {
        Optional<Rezervare> rezervare = rezervareService.getRezervareById(id);
        return rezervare.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Adaugă o rezervare
    @PostMapping
    public ResponseEntity<Rezervare> addRezervare(@RequestBody Rezervare rezervare) {
        Rezervare savedRezervare = rezervareService.addRezervare(rezervare);
        return savedRezervare != null ? ResponseEntity.status(HttpStatus.CREATED).body(savedRezervare)
                                      : ResponseEntity.badRequest().build();
    }

    // Șterge o rezervare
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRezervare(@PathVariable Long id) {
        rezervareService.deleteRezervare(id);
        return ResponseEntity.noContent().build();
    }
}
