package OrientacaoObjetos.Pratica.Exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Java");
        t1.setConcluida(false);

        Tarefa t2 = new Tarefa();
        t2.setDescricao("Fazer exercícios");
        t2.setConcluida(true);

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefa t : lista) {
            t.exibir();
        }
    }
}
