package n1exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) throws VendaBuidaException {
        Producte leche = new Producte(1.5F, "leche");
        Producte agua = new Producte(0.8F, "agua");
        Producte nuggets = new Producte(2.3F, "nuggets");
        Producte fuet = new Producte(2, "fuet");
        Producte pan = new Producte(0.5F, "pan");

        List<Producte> productes = new ArrayList<>();

        //Prueba la excepcion, para probar el metodo comentar esto y descomentar lo otro
        Venda venda = new Venda(productes);
        venda.calcularTotal();

        /*productes.add(agua);
        productes.add(nuggets);
        productes.add(fuet);
        productes.add(pan);

        Venda venda = new Venda(productes);
        venda.calcularTotal();*/
    }
}
