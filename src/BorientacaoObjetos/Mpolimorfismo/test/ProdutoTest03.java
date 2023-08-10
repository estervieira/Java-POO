package BorientacaoObjetos.Mpolimorfismo.test;

import BorientacaoObjetos.Mpolimorfismo.dominio.Computador;
import BorientacaoObjetos.Mpolimorfismo.dominio.Produto;
import BorientacaoObjetos.Mpolimorfismo.dominio.Tomate;
import BorientacaoObjetos.Mpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
