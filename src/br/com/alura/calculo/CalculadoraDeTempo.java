package src.br.com.alura.calculo;

import src.br.com.alura.screematch.modulos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;

    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
    public void inclui(Titulo titulo){
    this.tempoTotal += titulo.getDuracaoEmMinutos();

        }
    }




