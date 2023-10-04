package com.iago010.padroesdesignjava.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iago
 */


public class Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}

