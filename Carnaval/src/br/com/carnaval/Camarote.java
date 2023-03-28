package br.com.carnaval;

public class Camarote extends Ingresso {
    private double valorAdc;

    public Camarote(double valorIng, double valorCamarote) {
        super(valorIng);
        this.valorAdc = valorCamarote;
    }

    public double getValorAdc() {
        return valorAdc;
    }

    public void setValorCamarote(double valorCamarote) {
        this.valorAdc = valorCamarote;
    }

    public String tipoIngresso() {
        return "Categoria VIP" + (getValorIng() + getValorAdc());
    }
}