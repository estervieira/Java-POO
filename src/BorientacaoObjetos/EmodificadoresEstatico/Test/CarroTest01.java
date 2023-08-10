package BorientacaoObjetos.EmodificadoresEstatico.Test;

import BorientacaoObjetos.EmodificadoresEstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.impime();
        c2.impime();
        c3.impime();

        // Vai fazer o atributo pertencer a classe e todos os objetos vão compartilhar do mesmo valor
    }
}
