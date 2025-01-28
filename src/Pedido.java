/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.*;
/**
 *
 * @author HENRIQUE
 */

interface PedidoState {
    void avancarEstado(Pedido pedido);
    void cancelarPedido(Pedido pedido);
}

class PedidoEnviado implements PedidoState {
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

class PedidoEntregue implements PedidoState {
    @Override
    public void avancarEstado(Pedido pedido) {
        System.out.println("Pedido já foi entregue. Não pode avançar mais.");
    }
    
    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido já entregue. Não pode ser cancelado.");
    }
}

class Pedido {
    private int idPedido;
    private Date data;
    private List<ItemPedido> itens;
    private PedidoState estadoAtual;
    
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.estadoAtual = new PedidoEnviado(); // Estado inicial
    }
    
    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }
    
    public void removerItem(Produto produto) {
        itens.removeIf(item -> item.getProduto().equals(produto));
    }
    
    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularSubtotal).sum();
    }
    
    public void avancarEstado() {
        if (estadoAtual != null) {
            estadoAtual.avancarEstado(this);
        }
    }
    
    public void cancelarPedido() {
        if (estadoAtual != null) {
            estadoAtual.cancelarPedido(this);
        }
    }
    
    public void setEstadoAtual(PedidoState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public PedidoState getEstadoAtual() {
        return estadoAtual;
    }
}
