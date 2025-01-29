/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline.pagamento;

/**
 *
 * @author HENRIQUE
 */

public abstract class Pagamento {
    private double valor;

    public void processaPagamento() {
        System.out.println("Pagamento processado: R$" + valor);
    }

    // Getters e Setters
}