package br.com.carnaval;
import javax.swing.JOptionPane;

public class Carnaval {

    public static void main(String[] args) {
        double valor, valorAdc;
        int opcao;
        Ingresso ingressoNormal = null;
        Vip ingressoVip = null;
        Camarote camarote = null;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("digite a opção desejada:\n 1.Ingresso Normal \n 2.Ingresso Vip\n 3.Camarote \n 4.Sair"));

            switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingressso"));
                    ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.tipoIngresso(),"Mensagem", JOptionPane.ERROR_MESSAGE);
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso:"));
                    valorAdc = Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional do Ingresso:"));
                    ingressoVip = new Vip(valor, valorAdc);
                    JOptionPane.showMessageDialog(null, ingressoVip.tipoIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso:"));
                    valorAdc = Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional do Ingresso:"));
                    camarote = new Camarote(valor, valorAdc);
                    JOptionPane.showMessageDialog(null, camarote.tipoIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção valida!", "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
            }

        } while (opcao != 4);
        camarote.getValorAdc();

    }
}

