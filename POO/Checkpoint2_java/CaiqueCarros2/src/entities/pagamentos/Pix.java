package entities.pagamentos;

import entities.Contrato;
import entities.OpcaoPagamento;

public class Pix implements OpcaoPagamento
{

    @Override
    public double totalComTaxas(double total) {
        return total + 0;
    }

    @Override
    public double taxa(double total) {
        return total;
    }


}
