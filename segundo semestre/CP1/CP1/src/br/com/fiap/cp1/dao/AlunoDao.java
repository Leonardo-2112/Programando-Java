package br.com.fiap.cp1.dao;

import br.com.fiap.cp1.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    //Coleção interna encapsulada (agora "private", como manda a boa prática)
    private final List<Aluno> alunos = new ArrayList<>();

    //Gera o código (id) automaticamente, evitando duplicidade e erro de digitação
    private int proximoId = 1;

    /**
     * Cadastra um novo aluno. O código (id) é gerado automaticamente pelo
     * DAO. Não permite cadastrar dois alunos com o mesmo CPF.
     */
    public boolean inserirAluno(Aluno aluno) {
        if (buscarAlunoPorCpf(aluno.getCpf()) != null) {
            return false;
        }
        aluno.setId(proximoId);
        proximoId++;
        return alunos.add(aluno);
    }

    /**
     * Lista todos os alunos cadastrados.
     */
    public List<Aluno> buscarAlunos() {
        return alunos;
    }

    /**
     * Pesquisa por código (id) — usada apenas na opção de busca por código
     * do menu; não é utilizada como chave em outras operações (editar,
     * remover), que usam o CPF.
     */
    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    /**
     * Pesquisa por CPF. Usada como chave para validar duplicidade no
     * cadastro e como chave para editar e excluir um aluno.
     */
    public Aluno buscarAlunoPorCpf(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf() != null && aluno.getCpf().equalsIgnoreCase(cpf)) {
                return aluno;
            }
        }
        return null;
    }

    /**
     * Pesquisa por outro atributo (curso), diferente do código.
     * Pode retornar mais de um aluno, já que vários alunos podem
     * pertencer ao mesmo curso.
     */
    public List<Aluno> buscarAlunosPorCurso(String curso) {
        List<Aluno> encontrados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCurso() != null && aluno.getCurso().equalsIgnoreCase(curso)) {
                encontrados.add(aluno);
            }
        }
        return encontrados;
    }

    /**
     * Edita os dados de um aluno já cadastrado, localizado pelo CPF.
     */
    public boolean editarAluno(String cpf, Aluno alunoAtualizado) {
        Aluno alunoProcurado = buscarAlunoPorCpf(cpf);
        if (alunoProcurado != null) {
            alunoProcurado.setNome(alunoAtualizado.getNome());
            alunoProcurado.setEmail(alunoAtualizado.getEmail());
            alunoProcurado.setCpf(alunoAtualizado.getCpf());
            alunoProcurado.setCurso(alunoAtualizado.getCurso());
            alunoProcurado.setDataNascimento(alunoAtualizado.getDataNascimento());
            alunoProcurado.setEstaAtivo(alunoAtualizado.isEstaAtivo());
            return true;
        }
        return false;
    }

    /**
     * Remove um aluno pelo CPF.
     */
    public boolean excluirAluno(String cpf) {
        Aluno alunoProcurado = buscarAlunoPorCpf(cpf);
        if (alunoProcurado != null) {
            return alunos.remove(alunoProcurado);
        }
        return false;
    }
}
