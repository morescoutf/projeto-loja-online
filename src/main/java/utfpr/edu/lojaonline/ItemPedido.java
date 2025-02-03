/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;

/**
 *
 * @author HENRIQUE
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double precoTotal;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = produto.calculaPreco() * quantidade;
    }

    // Getters adicionados
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public double calcularSubtotal() {
        return precoTotal;
    }
}