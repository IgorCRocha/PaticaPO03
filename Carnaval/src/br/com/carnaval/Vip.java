package br.com.carnaval;

public class Vip extends Ingresso{
    private double valorAdc;

    public Vip(double valorIng, double valorVip) {
        super(valorIng);
        this.valorAdc = valorAdc;
    }
    public double getValorVip() {
        return valorAdc;
    }
    public void setValorVip(double valorVip) {
        this.valorAdc= valorVip;
    }
    public String tipoIngresso (){
        return  "Categoria VIP" +(getValorIng()+getValorVip());
}
}
