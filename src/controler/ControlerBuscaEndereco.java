package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusEndereco;

public class ControlerBuscaEndereco implements ActionListener {

    FormBusEndereco formBusEndereco;

    public ControlerBuscaEndereco(FormBusEndereco formBusEndereco) {

        this.formBusEndereco = formBusEndereco;

        this.formBusEndereco.getjButtonCarregar().addActionListener(this);
        this.formBusEndereco.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusEndereco.getjButtonCarregar()) {
            if (this.formBusEndereco.getjTableBuscas().getValueAt(this.formBusEndereco.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroEndereco.codigo = (int) this.formBusEndereco.getjTableBuscas().getValueAt(this.formBusEndereco.getjTableBuscas().getSelectedRow(), 0);
                formBusEndereco.dispose();
            } else if (evento.getSource() == formBusEndereco.getjButtonSair()) {
                formBusEndereco.dispose();
            }
        }
    }
}
