/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HENRIQUE
 */
import java.util.*;

class Cliente {
    private String nome;
    private String endereco;
    private String email;
    
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    
    public void realizarPedido() {
        System.out.println("Pedido realizado por " + nome);
    }
    
    public String getNome() {
        return nome;
    }
}
