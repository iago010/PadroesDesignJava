package com.iago010.padroesdesignjava.Builder;

/**
 *
 * @author iago
 */
public class Diretor {
    public void construir(ProdutoBuilder builder) {
        builder.setParte1("Parte 1 construída")
               .setParte2("Parte 2 construída");
    }
}

