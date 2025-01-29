/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;

/**
 *
 * @author HENRIQUE
 */
public class Produto {
    private String nome;
    private double preco;

    public void cadastraProduto() {
        System.out.println("Produto cadastrado: " + nome);
    }

    public void atualizaProduto() {
        System.out.println("Produto atualizado: " + nome);
    }

    public double calculaPreco() {
        return preco;
    }

    // Getters e Setters
}