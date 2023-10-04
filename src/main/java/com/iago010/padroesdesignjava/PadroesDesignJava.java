
package com.iago010.padroesdesignjava;

import com.iago010.padroesdesignjava.Builder.Diretor;
import com.iago010.padroesdesignjava.Builder.Produto;
import com.iago010.padroesdesignjava.Builder.ProdutoBuilder;
import com.iago010.padroesdesignjava.Factory.Criador;
import com.iago010.padroesdesignjava.Factory.CriadorConcreto;
import com.iago010.padroesdesignjava.Observer.Observador;
import com.iago010.padroesdesignjava.Observer.ObservadorConcreto;
import com.iago010.padroesdesignjava.Observer.Sujeito;
import com.iago010.padroesdesignjava.Singleton.Singleton;
import com.iago010.padroesdesignjava.Factory.ProdutoFactory;

/**
 *
 * @author iago
 */

public class PadroesDesignJava {

    public static void main(String[] args) {
        // Teste Singleton
        System.out.println("Teste Singleton:");
        Singleton singleton = Singleton.getInstance();
        System.out.println("Hash da instância Singleton: " + singleton.hashCode());

        // Teste Factory Method
        System.out.println("\nTeste Factory Method:");
        Criador criador = new CriadorConcreto();
        ProdutoFactory produto = criador.factoryMethod();
        produto.criar();

        // Teste Observer
        System.out.println("\nTeste Observer:");
        Observador observador1 = new ObservadorConcreto("Observador 1");
        Observador observador2 = new ObservadorConcreto("Observador 2");
        Sujeito sujeito = new Sujeito();
        sujeito.adicionarObservador(observador1);
        sujeito.adicionarObservador(observador2);
        sujeito.notificarObservadores("Mensagem importante!");

        // Teste Builder
        System.out.println("\nTeste Builder:");
        ProdutoBuilder builder = new ProdutoBuilder();
        Diretor diretor = new Diretor();
        diretor.construir(builder);
        Produto produtoConstruido = builder.build();
        produtoConstruido.mostrar();
    }
}
