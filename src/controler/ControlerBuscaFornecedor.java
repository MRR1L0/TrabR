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

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusFornecedor.getjButtonCarregar()) {
            if (this.formBusFornecedor.getjTableBuscas().getValueAt(this.formBusFornecedor.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroFornecedor.codigo = (int) this.formBusFornecedor.getjTableBuscas().getValueAt(this.formBusFornecedor.getjTableBuscas().getSelectedRow(), 0);
                formBusFornecedor.dispose();
            } else if (evento.getSource() == formBusFornecedor.getjButtonSair()) {
                formBusFornecedor.dispose();
            }
        }
    }
}
