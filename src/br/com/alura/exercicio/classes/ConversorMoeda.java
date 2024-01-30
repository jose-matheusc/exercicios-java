package src.br.com.alura.exercicio.classes;

import src.br.com.alura.exercicio.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar = 4.92;
    private double real;

    public double getReal(){
        return real;
    }
    public void setReal(Double real){
        this.real = real;
    }

    public double getDolar() {
        return dolar;
    }


    @Override
    public double converterDolarParaReal() {
        return dolar*real;

    }
}
