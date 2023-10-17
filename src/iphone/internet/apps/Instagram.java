package com.github.gupaixao.iphone.internet.apps;

import com.github.gupaixao.iphone.camera.Camera;

public class Instagram implements Camera {
    private String usuario;
    private String senha;

    public Instagram(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto via Instagram");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Gravando vídeo via Instagram");

    }
}
