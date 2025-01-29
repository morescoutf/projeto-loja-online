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
    private int quantidade;
    private Produto produto; // Relação 1:1 com Produto

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.calculaPreco() * quantidade;
    }

    // Getters e Setters

    Object getProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}