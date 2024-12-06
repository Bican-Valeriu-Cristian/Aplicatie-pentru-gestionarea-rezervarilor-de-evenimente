package com.biki.service;

import com.biki.model.Rezervare;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RezervareService {

    private List<Rezervare> rezervari = new ArrayList<>();

    // Metodă pentru a obține toate rezervările
    public List<Rezervare> getAllRezervari() {
        return rezervari;
    }

    // Metodă pentru a crea o rezervare
    public Rezervare createRezervare(Rezervare rezervare) {
        rezervari.add(rezervare);
        return rezervare;
    }

    // Metodă pentru a șterge o rezervare
    public void deleteRezervare(Long id) {
        rezervari.removeIf(rezervare -> rezervare.getId().equals(id));
    }
}
