package br.com.folhadepagamento;

public class FPadrao extends Funcionario {

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        // TODO Auto-generated constructor stub
    }

    public double calcularProventos() {
        return getSalario();
    }

    public String toString() {
        return "Nome: " + getNome() + " Salario: " + getSalario();
    }
}