/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;
import utfpr.edu.lojaonline.estado.PedidoState;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HENRIQUE
 */

public class Pedido {
    private int idPedido;
    private Date data;
    private PedidoState estadoAtual = new PedidoEnviado(); // Estado inicial: "Enviado"
    private List<ItemPedido> itens = new ArrayList<>();

    // Método para avançar o estado
    public void avancarEstado() {
        estadoAtual.avancarEstado(this);
    }

    // Método para cancelar o pedido
    public void cancelarPedido() {
        estadoAtual.cancelarPedido(this);
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setPrecoTotal(produto.calculaPreco() * quantidade);
        itens.add(item);
    }

    public void removerItem(Produto produto, int quantidade) {
        itens.removeIf(item -> 
            item.getProduto().equals(produto) && 
            item.getQuantidade() == quantidade
        );
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::getPrecoTotal).sum();
    }

    // Getters e Setters
}