/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author HENRIQUE
 */
class Pedido {
    private int idPedido;
    private Date data;
    private List<ItemPedido> itens;
    
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.data = new Date();
        this.itens = new ArrayList<>();
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
    
    public List<ItemPedido> getItens() {
        return itens;
    }
}