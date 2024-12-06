package com.biki.controller;

import com.biki.model.Eveniment;
import com.biki.service.EvenimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EvenimentWebController {

    @Autowired
    private EvenimentService evenimentService;

    // Endpoint GET pentru a afișa formularul de adăugare eveniment
    @GetMapping("/eveniment-form")
    public String showForm(Model model) {
        // Crearea unui obiect Eveniment gol pentru formular
        model.addAttribute("eveniment", new Eveniment(0L, "", "", "", 0));
        return "eveniment_form"; // Numele fișierului HTML care va conține formularul
    }

    // Endpoint POST pentru a salva evenimentul adăugat
    @PostMapping("/evenimente")
    public String submitForm(@ModelAttribute Eveniment eveniment) {
        // Salvarea evenimentului folosind serviciul
        evenimentService.createEveniment(eveniment);
        return "redirect:/eveniment-form"; // Redirecționare către formularul gol după adăugare
    }
}
