package BorientacaoObjetos.BintroducaoMetodos.SobrecargaMetodos.Test;

import BorientacaoObjetos.BintroducaoMetodos.SobrecargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }


    //Sobrecarga de método: ter um método com o mesmo nome, porém com tipo ou quantidade de parêmetros diferetentes.
}
