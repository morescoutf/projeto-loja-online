    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HENRIQUE
 */
public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("Joao Silva", "Rua das Flores, 123", "joao@email.com");
        
        // Criando um pedido
        Pedido pedido = new Pedido(1);
        
        // Criando produtos
        Produto camisa = new Produto("Camisa Polo", 50.0);
        Produto tenis = new Produto("Tenis Esportivo", 200.0);
        
        // Adicionando itens ao pedido
        pedido.adicionarItem(camisa, 2);
        pedido.adicionarItem(tenis, 1);
        
        // Exibindo o total do pedido
        System.out.println("Total do pedido: R$" + pedido.calcularTotal());
        
        // Avançando o estado do pedido (Pedido Enviado -> Pedido Entregue)
        pedido.avancarEstado();
        
        // Tentando cancelar o pedido (não será possível após a entrega)
        pedido.cancelarPedido();
        
        // Exibindo status final
        System.out.println("Estado atual do pedido: " + pedido.getEstadoAtual().getClass().getSimpleName());
        
        // Exibindo informações do cliente e pedido
        System.out.println("Cliente: " + cliente.getNome() + " realizou um pedido no valor de R$" + pedido.calcularTotal());
    }
}


