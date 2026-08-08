package exercicio01.br.com.fiap.view;

import exercicio01.br.com.fiap.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        //Adiciona a lista
        alunos.add(new Aluno("Leonardo", 10, 18, 778899));
        alunos.add(new Aluno("Gustavo", 8, 2, 12356));
        alunos.add(new Aluno("Gabriel", 4, 30, 654321));
        //Total de alunos cadastrados
        System.out.println("Total de alunos cadastrados: " + alunos.size());

        //Média geral de notas
        double somaDasNotas = 0;
        for(int i = 0; i< alunos.size(); i++){
            somaDasNotas += alunos.get(i).getNota();
        }
        double mediaDasNotas = somaDasNotas/alunos.size();
        System.out.println("\nA média geral das notas é: " + mediaDasNotas);

        //Média geral de idade
        double somaDasIdades = 0;
        for(int i = 0; i< alunos.size(); i++){
            somaDasIdades += alunos.get(i).getIdade();
        }
        double mediaDasIdades = somaDasIdades/alunos.size();
        System.out.println("A média geral das idades é: " + mediaDasIdades);

        //Maior Idade
        System.out.println("\nAlunos maiores de idade:");
        for(Aluno aluno :alunos){
            if (aluno.getIdade()>= 18 ){
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("Alunos menores de idade:");
        for(Aluno aluno :alunos){
            if (aluno.getIdade()< 18 ){
                System.out.println(aluno.getNome());
            }
        }
    }
}
