package BorientacaoObjetos.Kclassesabstratas.Test;

import BorientacaoObjetos.Kclassesabstratas.Dominio.Desenvolvedor;
import BorientacaoObjetos.Kclassesabstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nani", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
