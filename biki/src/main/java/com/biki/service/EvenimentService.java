package com.biki.service;

import com.biki.model.Eveniment;
import com.biki.repository.EvenimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenimentService {

    @Autowired
    private EvenimentRepository evenimentRepository;

    // Obține toate evenimentele
    public List<Eveniment> getAllEvenimente() {
        return evenimentRepository.findAll();
    }

    // Obține un eveniment după ID
    public Optional<Eveniment> getEvenimentById(Long id) {
        return evenimentRepository.findById(id);
    }

    // Adaugă un nou eveniment
    public Eveniment addEveniment(Eveniment eveniment) {
        return evenimentRepository.save(eveniment);
    }

    // Actualizează un eveniment existent
    public Eveniment updateEveniment(Long id, Eveniment evenimentDetalii) {
        Optional<Eveniment> evenimentOptional = evenimentRepository.findById(id);
        if (evenimentOptional.isPresent()) {
            Eveniment eveniment = evenimentOptional.get();
            eveniment.setNume(evenimentDetalii.getNume());
            eveniment.setLocatie(evenimentDetalii.getLocatie());
            eveniment.setData(evenimentDetalii.getData());
            eveniment.setCapacitateMaxima(evenimentDetalii.getCapacitateMaxima());
            return evenimentRepository.save(eveniment);
        }
        return null;
    }

    // Șterge un eveniment
    public void deleteEveniment(Long id) {
        evenimentRepository.deleteById(id);
    }
}
