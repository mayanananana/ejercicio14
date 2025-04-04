package ejercicio14.servicios;

import ejercicio14.dao.PedidoDao;
import ejercicio14.dao.modelos.Pedido;

public class PedidoServices {
    private PedidoDao misPedidos= new PedidoDao();

    public void anadirPedido(Pedido pedido) {
        if (!misPedidos.getMisPedidos().containsKey(pedido.getId())) {
            misPedidos.anadirPedido(pedido);
        }
    }

    public boolean eliminarPedido(int id) {
        Pedido pedido = new Pedido();
        pedido.setId(id);
        return misPedidos.eliminarPedido(pedido);
    }

}
