package org.example;

public class TXT implements Extensao {

    @Override
    public String salvar(String nome) {
        return "Extensão *.TXT salva!";
    }
}