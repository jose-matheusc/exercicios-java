package src.br.com.alura.modulos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvalicoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;


    public int getTotalDeAvalicoes(){
        return totalDeAvalicoes;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvalicoes() {
        return somaDasAvalicoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setTotalDeAvalicoes(int totalDeAvalicoes){
        this.totalDeAvalicoes = totalDeAvalicoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;

    }


    public void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println("Ano: " +anoDeLancamento);

    }
    public void avalia(double nota){
        somaDasAvalicoes+= nota;
        totalDeAvalicoes++;
    }
    public double pegaMedia(){
        return somaDasAvalicoes/totalDeAvalicoes;
    }




}
