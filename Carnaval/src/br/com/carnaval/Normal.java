package br.com.carnaval;

public class Normal extends Ingresso{

    public Normal(double valorIng) {
        super(valorIng);
    }
    public String tipoIngresso(){
        return "Categoria Normal:"+getValorIng();
    }

}
