
package com.iago010.padroesdesignjava.Factory;

/**
 *
 * @author iago
 */
public class ProdutoConcreto implements ProdutoFactory {
    @Override
    public void criar() {
        System.out.println("Produto criado");
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

