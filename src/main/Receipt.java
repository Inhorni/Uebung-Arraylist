package main;

import java.util.ArrayList;

public class Receipt {
    public static void main(String[] args) {
        // Erstellung der ArrayList mit Objekten vom Typ ReceiptItem
        ArrayList<ReceiptItem> receiptItems = new ArrayList<>();

        // Elemente Hinzufügen
        receiptItems.add(new ReceiptItem("Fischstäbchen", 15, 1.79));
        receiptItems.add(new ReceiptItem("Steaks", 5 , 3.99));
        receiptItems.add(new ReceiptItem("Naturelle", 6, 4.99));
        receiptItems.add(new ReceiptItem("Magnum Eis Creme", 2, 2.99));

        // Iteration durch die ArrayList und Ausgabe der Eigenschaften jedes Objekts
        for (ReceiptItem item : receiptItems) {
            System.out.println(item.getName() + " x " + item.getAnzahl() + " = " + item.getAnzahl() * item.getPreis() + " Euro");
        }
    }
}
