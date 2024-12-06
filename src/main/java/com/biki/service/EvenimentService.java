package com.biki.service;

import com.biki.model.Eveniment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvenimentService {

    private List<Eveniment> evenimente = new ArrayList<>();

    // Metodă pentru a obține toate evenimentele
    public List<Eveniment> getAllEvenimente() {
        return evenimente;
    }

    // Metodă pentru a crea un eveniment
    public Eveniment createEveniment(Eveniment eveniment) {
        evenimente.add(eveniment);
        return eveniment;
    }

    // Metodă pentru a șterge un eveniment
    public void deleteEveniment(Long id) {
        evenimente.removeIf(eveniment -> eveniment.getId().equals(id));
    }
}
