package com.biki.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rezervare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeClient;

    private String emailClient;

    @ManyToOne
    @JoinColumn(name = "eveniment_id")
    private Eveniment eveniment;

    private int numarLocuriRezervate;

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", numeClient='" + numeClient + '\'' +
                ", emailClient='" + emailClient + '\'' +
                ", eveniment=" + eveniment.getNume() +
                ", numarLocuriRezervate=" + numarLocuriRezervate +
                '}';
    }
}
