/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.lojaonline;

/**
 *
 * @author HENRIQUE
 */
public class RoupaFactory implements ProdutoFactory {
    @Override
    public Produto criarProduto() {
        return new Roupa();
    }
}