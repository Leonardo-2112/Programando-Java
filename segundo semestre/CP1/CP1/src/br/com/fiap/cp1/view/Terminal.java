package br.com.fiap.cp1.view;

import br.com.fiap.cp1.dao.AlunoDao;
import br.com.fiap.cp1.model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Terminal {

    private static final Scanner leitor = new Scanner(System.in);
    private static final AlunoDao alunoDao = new AlunoDao();
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Digite a Opção Desejada:");

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarAlunoPorCodigo();
                    break;
                case 4:
                    buscarAlunoPorCpf();
                    break;
                case 5:
                    buscarAlunosPorCurso();
                    break;
                case 6:
                    editarAluno();
                    break;
                case 7:
                    removerAluno();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma das opções do menu.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("----------------MENU----------------");
        System.out.println("1-Cadastrar aluno");
        System.out.println("2-Buscar todos alunos");
        System.out.println("3-Buscar aluno pelo código");
        System.out.println("4-Buscar aluno pelo CPF");
        System.out.println("5-Buscar alunos por curso");
        System.out.println("6-Editar Aluno");
        System.out.println("7-Remover aluno");
        System.out.println("0-Sair do Programa");
    }

    private static void cadastrarAluno() {
        String nome = lerTexto("Digite o nome completo do aluno:");
        String cpf = lerTexto("Digite o CPF do aluno:");
        String email = lerTexto("Digite o email do aluno:");
        LocalDate dataNascimento = lerData("Digite a data de nascimento do aluno (dd/MM/yyyy):");
        String curso = lerTexto("Digite o curso do aluno:");
        boolean estaAtivo = lerBooleano("O aluno esta ativo? (true/false):");

        Aluno aluno = new Aluno(nome, cpf, email, dataNascimento, curso, estaAtivo);

        if (alunoDao.inserirAluno(aluno)) {
            System.out.println("Aluno cadastrado com sucesso! Código gerado: " + aluno.getId());
        } else {
            System.out.println("Erro ao cadastrar: já existe um aluno com este CPF.");
        }
    }

    private static void listarAlunos() {
        List<Aluno> alunos = alunoDao.buscarAlunos();
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado até o momento!");
        } else {
            System.out.println(alunos);
        }
    }

    private static void buscarAlunoPorCodigo() {
        int id = lerInteiro("Digite o código do aluno para fazer a busca:");
        Aluno aluno = alunoDao.buscarAlunoPorId(id);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Não foi possível encontrar este aluno.");
        }
    }

    private static void buscarAlunoPorCpf() {
        String cpf = lerTexto("Digite o CPF do aluno para fazer a busca:");
        Aluno aluno = alunoDao.buscarAlunoPorCpf(cpf);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Não foi possível encontrar este aluno.");
        }
    }

    private static void buscarAlunosPorCurso() {
        String curso = lerTexto("Digite o curso para fazer a busca:");
        List<Aluno> encontrados = alunoDao.buscarAlunosPorCurso(curso);
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum aluno encontrado para este curso.");
        } else {
            System.out.println(encontrados);
        }
    }

    private static void editarAluno() {
        String cpf = lerTexto("Digite o CPF do aluno para editar:");
        Aluno alunoEncontrado = alunoDao.buscarAlunoPorCpf(cpf);

        if (alunoEncontrado != null) {
            String nome = lerTexto("Digite o nome completo do aluno:");
            String cpfNovo = lerTexto("Digite o CPF do aluno:");
            String email = lerTexto("Digite o email do aluno:");
            LocalDate dataNascimento = lerData("Digite a data de nascimento do aluno (dd/MM/yyyy):");
            String curso = lerTexto("Digite o curso do aluno:");
            boolean estaAtivo = lerBooleano("O aluno esta ativo? (true/false):");

            Aluno alunoAtualizado = new Aluno(nome, cpfNovo, email, dataNascimento, curso, estaAtivo);

            if (alunoDao.editarAluno(cpf, alunoAtualizado)) {
                System.out.println("Aluno atualizado!");
            }
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    private static void removerAluno() {
        String cpf = lerTexto("Digite o CPF do aluno para remover:");
        if (alunoDao.excluirAluno(cpf)) {
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Erro ao excluir: aluno não encontrado.");
        }
    }

    // ---------- Métodos auxiliares de leitura segura (evitam crash com entrada inválida) ----------

    private static String lerTexto(String mensagem) {
        System.out.println(mensagem);
        return leitor.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = leitor.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }

    private static LocalDate lerData(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = leitor.nextLine().trim();
            try {
                return LocalDate.parse(entrada, FORMATO_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida! Use o formato dd/MM/yyyy.");
            }
        }
    }

    private static boolean lerBooleano(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = leitor.nextLine().trim();
            if (entrada.equalsIgnoreCase("true") || entrada.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(entrada);
            }
            System.out.println("Entrada inválida! Digite 'true' ou 'false'.");
        }
    }
}
