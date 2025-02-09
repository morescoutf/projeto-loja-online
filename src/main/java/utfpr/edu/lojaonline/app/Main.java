/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline.app;

import utfpr.edu.lojaonline.Cliente;
import utfpr.edu.lojaonline.Pedido;
import utfpr.edu.lojaonline.Produto;
import utfpr.edu.lojaonline.Calcado;
import utfpr.edu.lojaonline.Roupa;
import utfpr.edu.lojaonline.pagamento.Pagamento;
import utfpr.edu.lojaonline.pagamento.PagamentoCartao;
import utfpr.edu.lojaonline.pagamento.PagamentoBoleto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setNome("Joao Vitor");
        Pedido pedido = new Pedido();

        System.out.print("Digite a quantidade de calcados: ");
        int quantidadeCalcados = scanner.nextInt();
        if (quantidadeCalcados > 0) {
            Calcado tenis = new Calcado();
            tenis.setNome("Tenis Esportivo");
            tenis.setPreco(300.0);
            tenis.setNumero(42);
            tenis.setMaterial("Couro");
            pedido.adicionarItem(tenis, quantidadeCalcados);
        }

        System.out.print("Digite a quantidade de roupas: ");
        int quantidadeRoupas = scanner.nextInt();
        if (quantidadeRoupas > 0) {
            Roupa camiseta = new Roupa();
            camiseta.setNome("Camiseta");
            camiseta.setPreco(50.0);
            pedido.adicionarItem(camiseta, quantidadeRoupas);
        }

        System.out.println("Total do Pedido: R$ " + pedido.calcularTotal());

        // Escolha do pagamento
        System.out.println("\nEscolha o metodo de pagamento:");
        System.out.println("1 - Cartao");
        System.out.println("2 - Boleto");
        System.out.print("Digite a opcao: ");
        int opcaoPagamento = scanner.nextInt();

        Pagamento pagamento;
        if (opcaoPagamento == 1) {
            pagamento = new PagamentoCartao();
            System.out.println("\nPagamento com cartao selecionado.");
        } else if (opcaoPagamento == 2) {
            pagamento = new PagamentoBoleto();
            System.out.println("\nPagamento com boleto selecionado.");
        } else {
            System.out.println("Opcao invalida! Pagamento nao registrado.");
            pagamento = null;
        }

        if (pagamento != null) {
            pagamento.setValor(pedido.calcularTotal());
            pagamento.processaPagamento();
        }

        scanner.close();
    }
}
