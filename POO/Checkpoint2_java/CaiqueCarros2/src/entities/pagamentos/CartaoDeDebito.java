package entities.pagamentos;

import entities.OpcaoPagamento;

public class CartaoDeDebito implements OpcaoPagamento {

    @Override
    public double totalComTaxas(double total) {
        return total + taxa(total);
    }

    @Override
    public double taxa(double total) {
        return total * 0.02;
    }


}

