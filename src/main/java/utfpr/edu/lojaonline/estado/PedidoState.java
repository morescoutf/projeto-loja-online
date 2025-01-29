/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utfpr.edu.lojaonline.estado;
import utfpr.edu.lojaonline.Pedido;
/**
 *
 * @author HENRIQUE
 */

public interface PedidoState {
    void avancarEstado(Pedido pedido);
    void cancelarPedido(Pedido pedido);
}