package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusProduto;

public class ControlerBuscaProduto implements ActionListener {

    FormBusProduto formBusProduto;

    public ControlerBuscaProduto(FormBusProduto formBusProduto) {

        this.formBusProduto = formBusProduto;

        this.formBusProduto.getjButtonCarregar().addActionListener(this);
        this.formBusProduto.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusProduto.getjButtonCarregar()) {
            if (this.formBusProduto.getjTableBuscas().getValueAt(this.formBusProduto.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroBairro.codigo = (int) this.formBusProduto.getjTableBuscas().getValueAt(this.formBusProduto.getjTableBuscas().getSelectedRow(), 0);
                formBusProduto.dispose();
            } else if (evento.getSource() == formBusProduto.getjButtonSair()) {
                formBusProduto.dispose();
            }
        }
    }
}
