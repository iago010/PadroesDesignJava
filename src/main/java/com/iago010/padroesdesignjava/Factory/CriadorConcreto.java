package com.iago010.padroesdesignjava.Factory;

/**
 *
 * @author iago
 */
public class CriadorConcreto extends Criador {
    @Override
    public ProdutoFactory factoryMethod() {
        return new ProdutoConcreto();
    }
}
