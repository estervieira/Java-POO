package BorientacaoObjetos.Mpolimorfismo.servico;

import BorientacaoObjetos.Mpolimorfismo.dominio.Produto;
import BorientacaoObjetos.Mpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate ) {

            /* Tomate tomate = (Tomate) produto;
            ((Tomate) produto).getDataValidade();
            ou
            System.out.println(((Tomate) produto).getDataValidade());
            ou */
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
