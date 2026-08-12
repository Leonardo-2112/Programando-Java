package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.model.Turma;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exemplo02 {
    static void main() {
        //Criar uma sala
        Turma turma = new Turma();
        Scanner leitor = new Scanner(System.in);

        try {
            //Pedir para a sala da turma
            System.out.println("Digite a sala: ");
            int sala = leitor.nextInt();

            //Adicionar a sala na turma
            turma.alterarSala(sala);

            //Exibir a sala da turma
            System.out.println("Sala da turma: " + turma.getSala());
        }catch (InputMismatchException e){
            System.out.println("Número Inválido");
        }
        catch (RuntimeException e){
            System.out.println("Sala inválida");
        }finally {
            leitor.close();
        }
    }
}
