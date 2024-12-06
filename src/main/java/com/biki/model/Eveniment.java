package com.biki.model;

public class Eveniment {

    private Long id;
    private String nume;
    private String locatie;
    private String data;
    private int capacitateMaxima;

    // Constructor
    public Eveniment(Long id, String nume, String locatie, String data, int capacitateMaxima) {
        this.id = id;
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
        this.capacitateMaxima = capacitateMaxima;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public void setCapacitateMaxima(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", data='" + data + '\'' +
                ", capacitateMaxima=" + capacitateMaxima +
                '}';
    }
}
