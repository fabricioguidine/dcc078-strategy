package org.example;

public class Usuario {

    public String salvarHTML(String nome){
        return Gerenciador.salvar(new HTML(), nome);
    };

    public String salvarPDF(String nome){
        return Gerenciador.salvar(new PDF(), nome);
    };

    public String salvarTXT(String nome){
        return Gerenciador.salvar(new TXT(), nome);
    };

    public String salvarXML(String nome){
        return Gerenciador.salvar(new XML(), nome);
    };

}
