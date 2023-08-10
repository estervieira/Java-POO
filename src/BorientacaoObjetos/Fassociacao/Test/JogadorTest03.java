package BorientacaoObjetos.Fassociacao.Test;

import BorientacaoObjetos.Fassociacao.Dominio.Jogador;
import BorientacaoObjetos.Fassociacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("---- Time ----");

        time.imprime();

    }
}
