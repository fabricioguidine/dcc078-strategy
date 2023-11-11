package org.example;

public class PDF implements Extensao {

    @Override
    public String salvar(String nome) {
        return "Extensão *.PDF salva!";
    }
}