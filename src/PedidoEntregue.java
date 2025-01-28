/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HENRIQUE
 */
public class PedidoEntregue implements PedidoState {
    @Override
    public void avancarEstado(Pedido pedido) {
        System.out.println("Pedido ja foi entregue. Nao pode avançar mais.");
    }
        
    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido ja entregue. Nao pode ser cancelado.");
    }
}

