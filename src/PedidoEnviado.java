/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HENRIQUE
 */
public class PedidoEnviado implements PedidoState {
    @Override
    public void avancarEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoEntregue());
        System.out.println("Pedido foi entregue!");
    }
    
    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido cancelado antes da entrega.");
        pedido.setEstadoAtual(null);
    }
}
