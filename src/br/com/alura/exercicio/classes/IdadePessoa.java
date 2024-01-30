package src.br.com.alura.exercicio.classes;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("É de maior " + getNome());
        } else System.out.println("É de menor " + getNome());
    }

}