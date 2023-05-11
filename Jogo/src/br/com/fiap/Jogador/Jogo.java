package br.com.fiap.Jogador;

import br.com.fiap.Jogo.BolaDeFogo;
import br.com.fiap.Jogo.Dragao;
import br.com.fiap.Jogo.Fase;
import br.com.fiap.Jogo.Mago;

public class Jogo {

    public static void main(String[] args) {
        var fase = new Fase();
        fase.carregar(new Mago());
        fase.carregar(new Dragao(15, 15));
        fase.carregar(new BolaDeFogo(30, 30));
    }
}
