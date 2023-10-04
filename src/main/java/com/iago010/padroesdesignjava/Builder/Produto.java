
package com.iago010.padroesdesignjava.Builder;

/**
 *
 * @author iago
 */
public class Produto {
    private String parte1;
    private String parte2;

    public void setParte1(String parte1) {
        this.parte1 = parte1;
    }

    public void setParte2(String parte2) {
        this.parte2 = parte2;
    }

    public void mostrar() {
        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
    }
}

