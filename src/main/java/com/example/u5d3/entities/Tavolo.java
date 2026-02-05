package com.example.u5d3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Tavolo {
    private int numeroTavolo;
    private int numeroMaxCoperti;
    private StatoTavolo stato;

    public Tavolo(StatoTavolo stato, int numeroMaxCoperti, int numeroTavolo) {
        this.stato = stato;
        this.numeroMaxCoperti = numeroMaxCoperti;
        this.numeroTavolo = numeroTavolo;
    }
}