package ejercicio14.dao.modelos;

import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private int id;
    private ArrayList<Producto> productos;
    private double precioTotal;

    public Pedido() {
    }

    public Pedido(int id, ArrayList<Producto> productos, double precioTotal) {
        this.id = id;
        this.productos = productos;
        this.precioTotal = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
