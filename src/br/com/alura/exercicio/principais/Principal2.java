package src.exercicio;

public class Principal2 {

    public static void main(String[] args) {


    IdadePessoa minhaPessoa = new IdadePessoa();
    minhaPessoa.setNome("teteu");
    System.out.println("O seu nome é: " +minhaPessoa.getNome());
    minhaPessoa.setIdade(19);
    minhaPessoa.verificarIdade();

    Livro novoLivro = new Livro();
    novoLivro.setAutor("David");
    novoLivro.setTitulo("sei lá");
    novoLivro.exibirDetalhes();

    }

}

