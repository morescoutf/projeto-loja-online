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
public class PedidoEnviado implements PedidoState {
    @Override
    public void avancarEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoEntregue());
        System.out.println("Estado atualizado: ENTREGUE.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido ja enviado: cancelamento nao permitido.");
    }
}