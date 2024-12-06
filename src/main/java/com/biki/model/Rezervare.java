package com.biki.model;

public class Rezervare {

    private Long id;
    private Long evenimentId;
    private String numeParticipant;
    private int locuriRezervate;

    // Constructor
    public Rezervare(Long id, Long evenimentId, String numeParticipant, int locuriRezervate) {
        this.id = id;
        this.evenimentId = evenimentId;
        this.numeParticipant = numeParticipant;
        this.locuriRezervate = locuriRezervate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEvenimentId() {
        return evenimentId;
    }

    public void setEvenimentId(Long evenimentId) {
        this.evenimentId = evenimentId;
    }

    public String getNumeParticipant() {
        return numeParticipant;
    }

    public void setNumeParticipant(String numeParticipant) {
        this.numeParticipant = numeParticipant;
    }

    public int getLocuriRezervate() {
        return locuriRezervate;
    }

    public void setLocuriRezervate(int locuriRezervate) {
        this.locuriRezervate = locuriRezervate;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", evenimentId=" + evenimentId +
                ", numeParticipant='" + numeParticipant + '\'' +
                ", locuriRezervate=" + locuriRezervate +
                '}';
    }
}
