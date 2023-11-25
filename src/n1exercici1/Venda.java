package n1exercici1;

import java.util.List;

public class Venda {
    private List<Producte> lista;
    private float       preuTotal = 0;

    public Venda(List<Producte> lista) {
        this.lista = lista;
    }

    protected void    calcularTotal() throws VendaBuidaException {
        try
        {
            if (this.lista.isEmpty())
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
            else
            {
                for (Producte prod : lista)
                    this.preuTotal += prod.getPreu();
            }
        } catch (VendaBuidaException e)
        {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sobrepasados los indices de la lista de productos");
        }
    }
}
