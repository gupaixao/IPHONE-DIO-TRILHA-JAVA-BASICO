package com.github.gupaixao.iphone;

import com.github.gupaixao.iphone.internet.Email;
import com.github.gupaixao.iphone.internet.apps.Chrome;
import com.github.gupaixao.iphone.internet.Navegador;
import com.github.gupaixao.iphone.internet.apps.Instagram;
import com.github.gupaixao.iphone.internet.apps.Safari;
import com.github.gupaixao.iphone.ipad.ReprodutorMusical;
import com.github.gupaixao.iphone.ipad.apps.Itunes;
import com.github.gupaixao.iphone.ipad.apps.Spotify;
import com.github.gupaixao.iphone.telefone.Contato;
import com.github.gupaixao.iphone.telefone.Telefone;

import java.time.Instant;

public class IphoneApplication {
    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("https://www.google.com");
        } else if (navegadorEscolhido.equalsIgnoreCase("Chrome")) {
            navegador = new Chrome("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("emailaleatorio@email.com");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Spotify")) {
            reprodutorMusical = new Spotify("Save Your Tears", "The Weeknd");
        } else if (reprodutorMusicalEscolhido.equalsIgnoreCase("iTunes")) {
            reprodutorMusical = new Itunes("My Girl", "Vintage Culture & Fancy");
        } else {
            System.out.println("Reprodutor musical não encontrado.");
        }

        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }

        Telefone telefone = new Telefone("11999999999");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Joao", "Silva", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Joao", "senha12345");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}
