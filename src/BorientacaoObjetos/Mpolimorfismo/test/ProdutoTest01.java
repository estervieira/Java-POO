package BorientacaoObjetos.Mpolimorfismo.test;

import BorientacaoObjetos.Mpolimorfismo.dominio.Computador;
import BorientacaoObjetos.Mpolimorfismo.dominio.Televisao;
import BorientacaoObjetos.Mpolimorfismo.dominio.Tomate;
import BorientacaoObjetos.Mpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
