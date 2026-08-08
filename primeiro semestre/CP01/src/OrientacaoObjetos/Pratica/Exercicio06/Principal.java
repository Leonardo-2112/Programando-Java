package OrientacaoObjetos.Pratica.Exercicio06;

public class Principal {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Leonardo");
        colaborador.setCargo("Desenvolvedor Júnior");
        colaborador.setNivelAcesso(2);

        colaborador.exibirDados();
        colaborador.alterarDados();
        colaborador.exibirDados();

    }
}
