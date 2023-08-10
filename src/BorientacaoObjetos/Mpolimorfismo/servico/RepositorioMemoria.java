package BorientacaoObjetos.Mpolimorfismo.servico;

import BorientacaoObjetos.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
