/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;


public class Cliente {
    private String nome;
    private String endereco;
    private String email;

    // Getters e Setters
    public void realizaPedido(Pedido pedido) {
        System.out.println("Pedido realizado por: " + nome);
    }
}
