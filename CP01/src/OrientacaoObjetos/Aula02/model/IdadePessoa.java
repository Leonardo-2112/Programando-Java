package OrientacaoObjetos.Aula02.model;

public class IdadePessoa {
    //Atributos
    private String nome;
    private int idade;

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos
    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Idade: " + idade +"\nMaior de Idade");
        }else {
            System.out.println("Idade: " + idade +"\nMenor de Idade");
        }
    }
}
