package com.biki.service;

import com.biki.model.Rezervare;
import com.biki.repository.RezervareRepository;
import com.biki.repository.EvenimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RezervareService {

    @Autowired
    private RezervareRepository rezervareRepository;

    @Autowired
    private EvenimentRepository evenimentRepository;

    // Obține toate rezervările
    public List<Rezervare> getAllRezervari() {
        return rezervareRepository.findAll();
    }

    // Obține o rezervare după ID
    public Optional<Rezervare> getRezervareById(Long id) {
        return rezervareRepository.findById(id);
    }

    // Adaugă o nouă rezervare
    public Rezervare addRezervare(Rezervare rezervare) {
        // Verifică dacă evenimentul există
        if (evenimentRepository.existsById(rezervare.getEveniment().getId())) {
            return rezervareRepository.save(rezervare);
        }
        return null;  // Evenimentul nu există
    }

    // Șterge o rezervare
    public void deleteRezervare(Long id) {
        rezervareRepository.deleteById(id);
    }
}
