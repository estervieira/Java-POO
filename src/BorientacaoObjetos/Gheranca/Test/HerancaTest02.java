package BorientacaoObjetos.Gheranca.Test;

import BorientacaoObjetos.Gheranca.Dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores defaut ou o que for passsado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores defaut ou o que for passsado
    // 8 - Bloc6o de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
