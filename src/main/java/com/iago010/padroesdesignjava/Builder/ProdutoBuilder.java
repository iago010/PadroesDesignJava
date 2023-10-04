/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iago010.padroesdesignjava.Builder;

/**
 *
 * @author iago
 */
public class ProdutoBuilder {
    private String parte1;
    private String parte2;

    public ProdutoBuilder setParte1(String parte1) {
        this.parte1 = parte1;
        return this;
    }

    public ProdutoBuilder setParte2(String parte2) {
        this.parte2 = parte2;
        return this;
    }

    public Produto build() {
        Produto produto = new Produto();
        produto.setParte1(parte1);
        produto.setParte2(parte2);
        return produto;
    }
}

