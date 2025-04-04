package ejercicio14.dao;

import ejercicio14.dao.modelos.Producto;

import java.util.ArrayList;

public class ProductoDao {

    private static ArrayList<Producto> misProductos = new ArrayList<Producto>();

    public ProductoDao() {
    }

    public ArrayList<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(ArrayList<Producto> misProductos) {
        ProductoDao.misProductos= misProductos;

    }

    public void anadirProducto(Producto producto) {
        misProductos.add(producto);
    }

    public boolean eliminarProducto(Producto p) {
        return misProductos.remove(p);

    }
}
