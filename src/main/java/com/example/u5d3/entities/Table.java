package com.example.u5d3.entities;


public class Table {
    private int numTable;
    private int maxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public Table(int numTable, int maxCoperti, boolean isFree, double costoCoperto) {
        this.numTable = numTable;
        this.maxCoperti = maxCoperti;
        this.isFree = isFree;
        this.costoCoperto = costoCoperto;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public int getNumTable() {
        return numTable;
    }

    public void setNumTable(int numTable) {
        this.numTable = numTable;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numTable=" + numTable +
                ", maxCoperti=" + maxCoperti +
                ", isFree=" + isFree +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
