package com.example.u5d3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int numeroMaxCoperti;
    private StatoTavolo stato;
}