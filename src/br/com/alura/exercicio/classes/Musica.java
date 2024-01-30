package src.exercicio;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    double somaAvaliacoes;
    int totalAvaliacoes;
    void exibeFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
        System.out.println("Numero de avaliações: " + totalAvaliacoes);
        System.out.println("Média: " +CalculaMedia());
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double CalculaMedia(){
        return somaAvaliacoes/totalAvaliacoes;
    }
}
