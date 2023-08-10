package BorientacaoObjetos.BintroducaoMetodos.Test;

import BorientacaoObjetos.BintroducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");

        //pessoa.idade = 70;
        pessoa.setIdade(70);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
