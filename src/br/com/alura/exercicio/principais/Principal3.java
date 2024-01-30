package src.br.com.alura.exercicio.principais;

import src.br.com.alura.exercicio.classes.ConversorMoeda;

public class Principal3 {
    public static void main(String[] args) {
        ConversorMoeda meuDinheiro = new ConversorMoeda();
        meuDinheiro.setReal(13.50);
        System.out.println(meuDinheiro.converterDolarParaReal());




    }
}
