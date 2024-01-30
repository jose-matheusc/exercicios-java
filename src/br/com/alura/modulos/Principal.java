package src.br.com.alura.modulos;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setNome("ToyStory");
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme: " +meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        meuFilme.exibeFichaTecnica();


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvalicoes());
//        System.out.println(meuFilme.totalDeAvalicoes);

        System.out.println("A média do filme é: " + meuFilme.pegaMedia());
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração em minutos: " +lost.getDuracaoEmMinutos());



        Filme outroFilme = new Filme();
        outroFilme.setAnoDeLancamento(1999);
        outroFilme.setNome("ToyStory 2");
        outroFilme.setDuracaoEmMinutos(180);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);

        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRemomendacao filtro = new FiltroRemomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Lost");
        episodio.setTotalAvaliacoes(300);
        filtro.filtra(episodio);

    }

}