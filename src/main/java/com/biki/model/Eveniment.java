package com.biki.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Eveniment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    private String locatie;

    private LocalDateTime data;

    private int capacitateMaxima;

    @Override
    public String toString() {
        return "Eveniment{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", data=" + data +
                ", capacitateMaxima=" + capacitateMaxima +
                '}';
    }
}
