/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline.estado;
import utfpr.edu.lojaonline.Pedido;
/**
 *
 * @author HENRIQUE
 */


public class PedidoEntregue implements PedidoState {
    @Override
    public void avancarEstado(Pedido pedido) {
        System.out.println("Pedido ja entregue: nao eh possivel avancar.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido ja entregue: cancelamento impossivel.");
    }
}