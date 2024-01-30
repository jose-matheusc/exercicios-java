package src.br.com.alura.exercicio.classes;
//comentário indicando autor
/**
 * Classe que representa um aluno
 *
 * @author josem
 * @version 0.1
 */
public class Aluno {
    String nome;
    int idade;



    void informacoes(){
        System.out.println(nome);
        System.out.println(idade);

    }

    Aluno novoAluno = new Aluno();


}


