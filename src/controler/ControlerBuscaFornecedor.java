package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusFornecedor;

public class ControlerBuscaFornecedor implements ActionListener {

    FormBusFornecedor formBusFornecedor;

    public ControlerBuscaFornecedor(FormBusFornecedor formBusFornecedor) {

        this.formBusFornecedor = formBusFornecedor;

        this.formBusFornecedor.getjButtonCarregar().addActionListener(this);
        this.formBusFornecedor.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusFornecedor.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusFornecedor.getjButtonSair()) {

        }

    }

}
