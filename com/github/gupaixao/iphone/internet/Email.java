package com.github.gupaixao.iphone.internet;

public class Email {
    private String enderecoEletronico;
    public Email(String enderecoEletronico) {
        this.enderecoEletronico = enderecoEletronico;
    }

    public void enviarEmail() {
        System.out.println("Email enviado.");
    }

    public void excluirEmail() {
        System.out.println("Email excluído.");
    }
}
