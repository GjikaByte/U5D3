package com.example.u5d3.entities;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Ordine {
    private Tavolo tavolo;
    private List<Item> elementoMenu;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDate oraAcquisizione;
    private double costocoperto;
    private double importoTotale;

    public Ordine(Tavolo tavolo, List<Item> elementoMenu, int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, LocalDate oraAcquisizione, int costocoperto) {
        if(numeroCoperti > tavolo.getNumeroMaxCoperti()){
            System.out.println("Il tavolo selezionato non ha abbastanza coperti");
            return;
        }
        this.tavolo = tavolo;
        this.elementoMenu = elementoMenu;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.importoTotale = costocoperto*numeroCoperti + elementoMenu.stream().mapToDouble(elem -> elem.getPrice()).sum();
    }
}
