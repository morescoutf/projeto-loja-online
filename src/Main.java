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
        Cliente cliente = new Cliente("João", "Rua A, 123", "joao@email.com");
        Produto produto = new Produto("Camiseta", 50.0);
        
        Pedido pedido = new Pedido(1);
        pedido.adicionarItem(produto, 2);
        
        System.out.println("Cliente: " + cliente.getNome() + " fez um pedido de:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome());
        }
        
        System.out.println("Total do Pedido: R$ " + pedido.calcularTotal());
    }
}

