/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iago010.padroesdesignjava.Observer;

/**
 *
 * @author iago
 */

public class ObservadorConcreto implements Observador {
    private String nome;

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}

