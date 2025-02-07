/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;

import utfpr.edu.lojaonline.estado.PedidoState;
import utfpr.edu.lojaonline.pagamento.Pagamento;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import utfpr.edu.lojaonline.estado.PedidoEnviado;
import utfpr.edu.lojaonline.pagamento.PagamentoCartao;

/**
 *
 * @author HENRIQUE
 */

public class Pedido {
    private int idPedido;
    private Date data;
    private PedidoState estadoAtual;
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagamento pagamento; 

    public Pedido() {
        this.estadoAtual = new PedidoEnviado(); 
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public void removerItem(Produto produto) {
        itens.removeIf(item -> item.getProduto().equals(produto));
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularSubtotal).sum();
    }

    public void avancarEstado() {
        estadoAtual.avancarEstado(this);
    }

    public void cancelarPedido() {
        estadoAtual.cancelarPedido(this);
    }

    public void setEstadoAtual(PedidoState estado) {
        this.estadoAtual = estado;
    }

    // Getters e Setters

    public void setPagamento(PagamentoCartao pagamento) {
        
    }
}