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

    // Setters adicionados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calculaPreco() {
        return this.preco;
    }
}

    // Getters e Setters