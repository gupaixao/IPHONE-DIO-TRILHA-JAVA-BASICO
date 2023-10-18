package com.github.gupaixao.iphone.internet.apps;

import com.github.gupaixao.iphone.internet.Navegador;

public class Chrome extends Navegador {
    public Chrome(String url) {
        super(url);
    }

    @Override
    public void exibirPagina() {
        validarConexaoInternet();
        System.out.println("Exibindo página no Chrome...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Chrome.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Chrome.");
    }
}
