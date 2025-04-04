package ejercicio14.dao;

import ejercicio14.dao.modelos.Pedido;

import java.util.HashMap;

public class PedidoDao {
    private static HashMap<Integer, Pedido> misPedidos= new HashMap<>();

    public PedidoDao() {
    }

    public HashMap<Integer, Pedido> getMisPedidos() {return misPedidos;}

    public void setMisPedidos(HashMap<Integer, Pedido> misPedidos) {
        PedidoDao.misPedidos= misPedidos;
    }

    public void anadirPedido(Pedido pedido) {
        misPedidos.put(pedido.getId(), pedido);
    }

    public boolean eliminarPedido(Pedido pedido) {
        return misPedidos.remove(pedido.getId(), pedido);
    }

}

