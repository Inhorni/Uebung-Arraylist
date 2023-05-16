package main;

public class ReceiptItem extends Receipt{
    private String name;
    private int anzahl;
    private double preis;

    public ReceiptItem(String name, int anzahl, double preis) {
        this.name = name;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public double getPreis() {
        return preis;
    }
}