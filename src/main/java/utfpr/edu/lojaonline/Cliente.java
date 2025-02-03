/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String email;
    private List<Pedido> pedidos = new ArrayList<>(); // Relação 1:N com Pedido

    public void realizaPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido realizado por: " + nome);
    }

    // Getters e Setters

    public void setNome(String joao_Vitor) {
    }
}