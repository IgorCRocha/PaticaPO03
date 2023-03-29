package br.com.folhadepagamento;

public class Empresa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FPadrao f1 = new FPadrao(34, "João", 800);
        System.out.println(f1.toString());

        FComissionado f2 = new FComissionado(2, "Maria", 3000, 2000, 25);
        System.out.println(f2.toString());
    }

}