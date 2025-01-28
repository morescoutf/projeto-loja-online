/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HENRIQUE
 */
class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double precoTotal;
    
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = produto.calcularPreco() * quantidade;
    }
    
    public double calcularSubtotal() {
        return precoTotal;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
}