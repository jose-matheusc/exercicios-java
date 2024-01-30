package src.br.com.alura.exercicio.classes;

public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibeFichaTecnica(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int idadeCarro(){
        return 2024-ano;
    }


}


