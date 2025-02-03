/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline.app;

import utfpr.edu.lojaonline.Cliente;
import utfpr.edu.lojaonline.Pedido;
import utfpr.edu.lojaonline.Produto;
import utfpr.edu.lojaonline.Calcado;
import utfpr.edu.lojaonline.pagamento.PagamentoCartao;
import java.util.Date;

/**
 *
 * @author HENRIQUE
 */

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João Vitor");

        // Criação do produto CAMISETA (preço definido)
        Produto camiseta = new Produto();
        camiseta.setNome("Camiseta");
        camiseta.setPreco(50.0); // Preço definido aqui!

        // Criação do produto TÊNIS (herdando de Produto)
        Calcado tenis = new Calcado();
        tenis.setNome("Tênis Esportivo");
        tenis.setPreco(300.0); // Preço definido aqui!
        tenis.setNumero(42);
        tenis.setMaterial("Couro");

        Pedido pedido = new Pedido();
        pedido.adicionarItem(camiseta, 2); // 2 camisetas
        pedido.adicionarItem(tenis, 1); // 1 tênis

        // Testar estados (opcional)
        pedido.avancarEstado(); // Avança para ENTREGUE
        pedido.avancarEstado(); // Não avança mais
        pedido.cancelarPedido(); // Não cancela

        // Exibir total (CORRETO agora)
        System.out.println("Total do pedido: R$" + pedido.calcularTotal());
    }
}
