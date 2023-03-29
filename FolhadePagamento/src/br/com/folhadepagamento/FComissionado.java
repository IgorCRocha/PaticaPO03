package br.com.folhadepagamento;

public class FComissionado extends Funcionario {
    private double vendas;
    private double percentual;

    public FComissionado(int matricula, String nome, double salario, double vendas, double percentual) {
        super(matricula, nome, salario);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double calcularProventos() {
        return getSalario() + (this.vendas*this.percentual/100);
    }

    public String toString() {
        return "Nome: " + getNome() + " Salario: " + calcularProventos();
    }

}