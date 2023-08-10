package BorientacaoObjetos.Fassociacao.Test;

import BorientacaoObjetos.Fassociacao.Dominio.Aluno;
import BorientacaoObjetos.Fassociacao.Dominio.Local;
import BorientacaoObjetos.Fassociacao.Dominio.Professor;
import BorientacaoObjetos.Fassociacao.Dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Baranca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar onde piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
