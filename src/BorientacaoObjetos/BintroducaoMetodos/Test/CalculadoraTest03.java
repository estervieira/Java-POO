package BorientacaoObjetos.BintroducaoMetodos.Test;

import BorientacaoObjetos.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double  result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 2));
        System.out.println("--------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
