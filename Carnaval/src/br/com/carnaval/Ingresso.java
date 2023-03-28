package br.com.carnaval;

public class Ingresso {
    private double valorIng;

    public Ingresso(double valorIng) {
        this.valorIng = valorIng;
    }
    public double getValorIng() {
        return valorIng;
    }
    public void setValorIng(double valorIng) {
        this.valorIng = valorIng;
    }
    public String tipoIngresso (){
        return "Valor do ingresso:" +getValorIng();
    }
}
