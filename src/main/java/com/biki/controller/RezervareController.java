package com.biki.controller;

import com.biki.model.Rezervare;
import com.biki.service.RezervareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rezervari")
public class RezervareController {

    @Autowired
    private RezervareService rezervareService;

    // Endpoint GET pentru a obține toate rezervările
    @GetMapping
    public List<Rezervare> getAllRezervari() {
        return rezervareService.getAllRezervari();
    }

    // Endpoint POST pentru a crea o rezervare
    @PostMapping
    public Rezervare createRezervare(@RequestBody Rezervare rezervare) {
        return rezervareService.createRezervare(rezervare);
    }

    // Endpoint DELETE pentru a șterge o rezervare
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRezervare(@PathVariable Long id) {
        rezervareService.deleteRezervare(id);
        return ResponseEntity.noContent().build();
    }
}
